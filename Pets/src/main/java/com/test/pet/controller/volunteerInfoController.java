package com.test.pet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class volunteerInfoController {

	@GetMapping("/volunteerinfo.do")
	public String volunteerinfo() {
		
		return "info/volunteerinfo";
	}
}
