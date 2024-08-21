package controllers;

import org.springframework.lang.Nullable;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import entities.AccountDetails;

@Controller
public class HomeController {
	
	@RequestMapping(value = { "/", "/login" }, method = RequestMethod.GET)
	public String login(@Nullable @RequestParam(value = "error") String error, Model model) {
		if (error != null) {
			model.addAttribute("msg", "Thông tin không chính xác !");
		}
		return "login";
	}
	
	
	@RequestMapping(value = "/checkrole")
	public String checkRole() {
		//lấy thông tin tài khoản
		AccountDetails account =  (AccountDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		//duyệt role để kiểm tra và điều hướng
		for(var g: account.getAuthorities()) {
			if(g.getAuthority().equals("ROLE_ADMIN")) {
				return "redirect:/admin/department";
			}
			if(g.getAuthority().equals("ROLE_USER")) {
				return "redirect:/home";
			}
		}
		return "403";
	}

	@RequestMapping("/logoutSuccess")
	public String logout(Model model) {
		model.addAttribute("msg", "Logout thành công!!!");
		return "login";
	}

	@RequestMapping("/403")
	public String accessDenied(Model model) {
		model.addAttribute("msg", "BẠN KHÔNG CÓ QUYỀN TRUY CẬP VÀO TRANG NÀY");
		return "403";
	}
}
