package com.test.pet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class adoptionController {

	@GetMapping("/adoptioninfo.do")
	public String adoption() {
		
		return "info/adoptioninfo";
	}
}
