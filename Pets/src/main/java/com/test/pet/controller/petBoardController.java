package com.test.pet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class petBoardController {

	@GetMapping("/petboard.do")
	public String petboard() {
		
		return "board/petboard";
	}
}
