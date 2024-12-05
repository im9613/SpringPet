package com.test.pet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.pet.model.AdoptionApplication;
import com.test.pet.service.AdoptionApplicationService;

@Controller
public class AdoptionApplicationController {
	
	@Autowired
	private AdoptionApplicationService adoptionApplicationService;
	
	@GetMapping("/applicationadoption.do")
	public String showForm(Model model) {
        model.addAttribute("application", new AdoptionApplication());
        return "application/applicationadoption";
    }

    @PostMapping("/submit")
    public String submitForm(@ModelAttribute("application") AdoptionApplication application) {
    	System.out.println("Received data in Controller: " + application);
        adoptionApplicationService.saveAdoptionApplication(application);
        return "redirect:/successapplicationadoption.do";
    }
	
	
}
