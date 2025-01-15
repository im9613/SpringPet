package com.test.pet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class volunteerBoardController {

	@GetMapping("/volunteerboard.do")
	public String volunteerboard() {
		
		return "board/volunteerboard";
	}
}
