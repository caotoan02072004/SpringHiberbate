package controllers;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import entities.AccountDetails;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@RequestMapping(value = {"","/"})
	public String index(Model model) {
		model.addAttribute("msg", "TRANG QUẢN LÝ ĐIỂM - DÀNH CHO QUẢN TRỊ");
		AccountDetails account =  (AccountDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		model.addAttribute("account", account);
		return "admin/home";
	}
	
	
	
	@RequestMapping("/loginProcess")
	public String loginSuccess(Model model) {
		
		return "admin/home";
	}

}