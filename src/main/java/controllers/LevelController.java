package controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dao.impl.LevelDAO;
import entities.Level;

@Controller
@RequestMapping("/admin")
public class LevelController {
	@Autowired
	LevelDAO levelDAO;
	
	@RequestMapping(value = "/level")
	public String index(Model model) {
		model.addAttribute("level", levelDAO.findAll());
		return "/admin/level/index";
	}
	
	@RequestMapping(value = "/level/add")
	public String add(Model model) {
		Level level = new Level();
		model.addAttribute("level", level);
		return "/admin/level/add";
	}
	
	@RequestMapping(value = "/level/insert")
	public String insert(Level level ,Model model) {
		levelDAO.insert(level);
		return "redirect:/admin/level";
	}
	
	@RequestMapping(value = "/level/edit")
	public String edit(Model model, @RequestParam("id") int id) {
		model.addAttribute("level", levelDAO.getById(id));
		return "/admin/level/update";
	}
	
	@RequestMapping(value = "/level/update")
	public String update(Model model, @ModelAttribute("level") Level level, Integer id) {
		levelDAO.update(level);
		return "redirect:/admin/level";
	}
	
	@RequestMapping(value = "/level/delete")
	public String delete(Model model, @RequestParam("id") int id) {
		levelDAO.delete(id);
		return "redirect:/admin/level";
	}
	
	@RequestMapping(value = "/level/search")
	public String index(Model model, @RequestParam("key") String key) {
		model.addAttribute("level", levelDAO.search(key));
		return "/admin/level/index";
	}
}
