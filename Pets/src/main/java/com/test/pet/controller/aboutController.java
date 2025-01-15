package com.test.pet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class aboutController {
	
	@GetMapping("/about.do")
	public String about() {
		
		return "info/about";
	}

}
