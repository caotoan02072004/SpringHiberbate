package controllers;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import entities.AccountDetails;

@Controller
@RequestMapping("/")
public class WebController {
	@RequestMapping("/home")
	public String index(Model model) {
		model.addAttribute("msg", "TRANG TRA CỨU ĐIỂM THI- DÀNH CHO SINH VIÊN");
		//Lấy thông tin tài khoản khi login thành công
		AccountDetails account =  (AccountDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		model.addAttribute("account", account);
		return "web/home";
	}
}