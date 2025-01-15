package com.test.pet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class missingBoardController {

	
	@GetMapping("/missingboard.do")
	public String missing() {
		
		return "board/missingboard";
	}
	
}
