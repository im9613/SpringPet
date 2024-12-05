package com.test.pet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class reviewBoardController {

	@GetMapping("/review.do")
	public String review() {
		
		return "board/adoptionreviewboard";
	}
}
