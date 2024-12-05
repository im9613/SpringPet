package com.test.pet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.test.pet.model.PetResult;
import com.test.pet.model.QuizScore;
import com.test.pet.service.PetResultService;

@Controller
public class PetMatchController {

	@Autowired
	private PetResultService petResultService;
	
	
	@GetMapping("/quiz.do")
	public String showQuiz() {
		return "petquiz/quiz";
	}
	
	 @PostMapping("/calculateResult")
	    public String calculateResult(@ModelAttribute QuizScore quizScore, Model model) {
	        int totalScore = quizScore.getTotalScore();
	        
	        //덤프
	        System.out.println("q1: " + quizScore.getQ1());
	        System.out.println("q2: " + quizScore.getQ2());
	        System.out.println("q3: " + quizScore.getQ3());
	        System.out.println("q4: " + quizScore.getQ4());
	        System.out.println("q5: " + quizScore.getQ5());
	        System.out.println("q6: " + quizScore.getQ6());
	        System.out.println("q7: " + quizScore.getQ7());
	        System.out.println("q8: " + quizScore.getQ8());
	        System.out.println("q9: " + quizScore.getQ9());
	        System.out.println("q10: " + quizScore.getQ10());
	        System.out.println("합계점수: " + totalScore);
	        
	        PetResult result = petResultService.getRandomResultByScore(totalScore);
	        model.addAttribute("result", result);
	        return "petquiz/quizresult"; // 결과 페이지
	}
	
}
