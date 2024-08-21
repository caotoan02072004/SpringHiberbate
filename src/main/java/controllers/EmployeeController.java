package controllers;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import dao.impl.CertificateDAO;
import dao.impl.DepartmentDAO;
import dao.impl.EmployeeDAO;
import dao.impl.LevelDAO;
import entities.Employee;

@Controller
@RequestMapping("/admin")
public class EmployeeController {
	
	@Autowired
	EmployeeDAO employeeDAO;
	
	@Autowired
	DepartmentDAO departmentDAO;
	
	@Autowired
	LevelDAO levelDAO;
	
	@Autowired
	CertificateDAO certificateDAO;
	
	@RequestMapping(value = "/employee")
	public String index(Model model) {
		model.addAttribute("employee", employeeDAO.findAll());
		return "admin/employee/index";
	}
	
	@RequestMapping(value = "/employee/add")
	public String add(Model model) {
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		model.addAttribute("departments", departmentDAO.findAll());
		model.addAttribute("levels", levelDAO.findAll());
		model.addAttribute("certificates", certificateDAO.findAll());
		return "admin/employee/add";
	}
	
	@RequestMapping(value = "/employee/insert")
	public String insert(@ModelAttribute("employee") Employee employee,@RequestParam(value = "file", required = false) MultipartFile file, Model model, HttpServletRequest req) {
		
		if (file != null) {
			String uploadRootPath = req.getServletContext().getRealPath("resources/images/employee");
			File destination = new File(uploadRootPath + "/" + file.getOriginalFilename());
			try {
				file.transferTo(destination);
			} catch (IllegalStateException | IOException e) {
				e.printStackTrace();
			}
			employee.setImage("images/employee/" + file.getOriginalFilename());
		}
		
		employeeDAO.insert(employee);
		return "redirect:/admin/employee";
	}
	
	@RequestMapping(value = "/employee/delete")
	public String delete(@RequestParam("id") int id) {
		employeeDAO.delete(id);
		return "redirect:/admin/employee";
	}
	
	@RequestMapping(value = "/employee/update")
	public String update(Model model, @ModelAttribute("employee") Employee employee, Integer id, @RequestParam(value = "file", required = false) MultipartFile file, HttpServletRequest req) {
		if (file.getSize() > 0) {
			String uploadRootPath = req.getSession().getServletContext().getRealPath("resources/images/certificate");
			File destination = new File(uploadRootPath + "/" + file.getOriginalFilename());
			try {
				file.transferTo(destination);
			} catch (IllegalStateException | IOException e) {
				e.printStackTrace();
			}
			if (file.getOriginalFilename().length() > 0)
				employee.setImage("images/certificate/" + file.getOriginalFilename());
			else {
				employee.setImage(certificateDAO.getById(employee.getId()).getImage());
			}
		} else {
			employee.setImage(certificateDAO.getById(employee.getId()).getImage());
		}
		employeeDAO.update(employee);
		return "redirect:/admin/employee";
	}
	
	@RequestMapping(value = "/employee/edit")
	public String edit(Model model, @RequestParam("id") int id) {
		model.addAttribute("employee", employeeDAO.getById(id));
		model.addAttribute("department", departmentDAO.getById(id));
		model.addAttribute("level", levelDAO.getById(id));
		model.addAttribute("certificate", certificateDAO.getById(id));
		model.addAttribute("departments", departmentDAO.findAll());
		model.addAttribute("levels", levelDAO.findAll());
		model.addAttribute("certificates", certificateDAO.findAll());
		return "admin/employee/update";
	}
}
