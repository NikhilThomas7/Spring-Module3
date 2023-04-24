package com.ust.mvc.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/professionp")
public class MyTech {
	@GetMapping
	public String respond(Model model) {
		
		model.addAttribute("myTech","java full stack developer");
		model.addAttribute("location","trivandrum");
		return "response2"; //view
	}


		
		
	}


