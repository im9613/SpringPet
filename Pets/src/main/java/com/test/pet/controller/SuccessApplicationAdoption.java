package com.test.pet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SuccessApplicationAdoption {

	@GetMapping("/successapplicationadoption.do")
	public String SuccessApplicationAdoption() {
		
		return "application/successapplicationadoption";
	}
}
