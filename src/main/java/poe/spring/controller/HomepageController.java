package poe.spring.controller;



import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomepageController {
	
	@GetMapping
	public String index (org.springframework.ui.Model model) {
		model.addAttribute("message", "Welcome Lucie et Guillaume");
		return "index";
	}
	
	
	
}