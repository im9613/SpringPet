package com.test.pet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class donationController {
	@GetMapping("/donation.do")
	public String donation() {
		
		return "donation/donation";
	}

}
