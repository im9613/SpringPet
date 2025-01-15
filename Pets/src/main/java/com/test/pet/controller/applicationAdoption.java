package com.test.pet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class applicationAdoption {

	
	@GetMapping("/applicationadoption.do")
	public String adoptionApplication() {
		
		return "application/applicationadoption";
		
	}
}
