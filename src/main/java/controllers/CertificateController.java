package controllers;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import dao.impl.CertificateDAO;
import entities.Certificate;

@Controller
@RequestMapping("/admin")
public class CertificateController {

	@Autowired
	CertificateDAO certificateDAO;

	@RequestMapping(value = "/certificate")
	public String index(Model model) {
		model.addAttribute("certificates", certificateDAO.findAll());
		return "admin/certificate/index";
	}

	@RequestMapping(value = "/certificate/add")
	public String addcertificate(Model model) {
		Certificate certificate = new Certificate();
		model.addAttribute("certificate", certificate);
		return "admin/certificate/add";
	}

	@RequestMapping(value = "/certificate/save")
	public String insertcertificate(@ModelAttribute("certificate") Certificate certificate,
			@RequestParam(value = "file", required = false) MultipartFile file, Model model, HttpServletRequest req) {

		if (file != null) {
			String uploadRootPath = req.getServletContext().getRealPath("resources/images/certificate");
			File destination = new File(uploadRootPath + "/" + file.getOriginalFilename());
			try {
				file.transferTo(destination);
			} catch (IllegalStateException | IOException e) {
				e.printStackTrace();
			}
			certificate.setImage("images/certificate/" + file.getOriginalFilename());
		}
		certificateDAO.insert(certificate);
		return"redirect:/admin/certificate";
	}

	@RequestMapping(value = "/certificate/search")
	public String index(Model model, @RequestParam("key") String key) {
		System.out.println(key);
		model.addAttribute("certificates", certificateDAO.Search(key));
		return "admin/certificate/index";
	}


	@RequestMapping("/certificate/edit")
	public String editcertificate(Model model, @RequestParam int id) {
		model.addAttribute("certificate", certificateDAO.getById(id));
		return "admin/certificate/update";
	}

	@RequestMapping("/certificate/update")
	public String updatecertificate(Model model, @ModelAttribute("certificate") Certificate certificate, Integer id,
			@RequestParam(value = "file", required = false) MultipartFile file, HttpServletRequest req) {
		if (file.getSize() > 0) {
			String uploadRootPath = req.getSession().getServletContext().getRealPath("resources/images/certificate");
			File destination = new File(uploadRootPath + "/" + file.getOriginalFilename());
			try {
				file.transferTo(destination);
			} catch (IllegalStateException | IOException e) {
				e.printStackTrace();
			}
			if (file.getOriginalFilename().length() > 0)
				certificate.setImage("images/certificate/" + file.getOriginalFilename());
			else {
				certificate.setImage(certificateDAO.getById(certificate.getId()).getImage());
			}
		} else {
			certificate.setImage(certificateDAO.getById(certificate.getId()).getImage());
		}
		
		certificateDAO.update(certificate);
		return "redirect:/admin/certificate";
	}

	@RequestMapping(value = "/certificate/delete")
	public String deletecertificate(@RequestParam("id") int id, Model model) {
		certificateDAO.delete(id);
		return "redirect:/admin/certificate";
	}

}
