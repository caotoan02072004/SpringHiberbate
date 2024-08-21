package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dao.impl.DepartmentDAO;
import entities.Department;

@Controller
@RequestMapping("/admin")
public class DepartmentController {
	
	@Autowired
	DepartmentDAO departmentDAO;
	
	@RequestMapping(value = "/department")
	public String home(Model model) {
		model.addAttribute("departments", departmentDAO.findAll());
		return "admin/department/index";
	}
	
	@RequestMapping(value = "/department/search")
	public String home(Model model, @RequestParam("key") String key) {
		model.addAttribute("departments", departmentDAO.Search(key));
		return "admin/department/index";
	}
	

	@RequestMapping(value = "/department/add")
	public String add(Model model) {
		Department department = new Department();
		model.addAttribute("department", department);
		return "admin/department/add";
	}
	
	@RequestMapping(value = "/department/save")
	private String insert(@ModelAttribute("department") Department department, Model model) {
		departmentDAO.insert(department);
		return "redirect:/admin/department";
	}
	
	@RequestMapping(value = "/department/edit")
	private String update(Model model, @RequestParam int id) {
		model.addAttribute("department", departmentDAO.getById(id));
		return "admin/department/update";
	}
	
	@RequestMapping(value = "/department/update")
	private String update(@ModelAttribute("department") Department department, Integer id, Model model) {
		departmentDAO.update(department);
		return "redirect:/admin/department";
	}
	
	@RequestMapping(value = "/department/delete")
	public String delete(@RequestParam int id) {
		departmentDAO.delete(id);
		return "redirect:/admin/department";
	}
}
