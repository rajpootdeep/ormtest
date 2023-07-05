package com.orm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.orm.model.Alien;

@Controller
public class HomeController {

	@ModelAttribute
	public void modelData(Model m) {
		m.addAttribute("name", "Deepu");
	}
//	@RequestMapping("/")
//	public String home() {
//		return "index";
//	}

	// adding comment

	// @RequestMapping("/addAlien")
//	public String addAlien(@RequestParam("aid") int aid, @RequestParam("aname") String aname, Model m) {
//
//		Alien a = new Alien();
//		a.setAid(aid);
//		a.setAname(aname);
//		m.addAttribute("Alien", a);
//		return "result";
//	}

//	public String addAlien(@ModelAttribute Alien a, Model m) {
//		m.addAttribute("Alien", a);
//		return "result";
//	}
	@PostMapping("addAlien")
	public String addAlien(@ModelAttribute("a1") Alien a) {

		return "result";
	}

	// @GetMapping("getAlien")
//	public String getAlien(Model m) {
//		List<Alien> aliens = Arrays.asList(new Alien(12, "Deep Kumar"));
//		m.addAttribute("result", aliens);
//		return "showalien";
//	}

	@GetMapping("getAlien")
	public String getAlien(Model m) {

		// m.addAttribute("result", dao.getAliens());
		return "showalien";
	}
}
