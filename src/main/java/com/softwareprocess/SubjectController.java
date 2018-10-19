package com.softwareprocess;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SubjectController {
	
	@Autowired
	private SubjectService subjectService;
	
	@GetMapping("/subject")
	public String getSubject(@RequestParam(name ="subject",required = false,defaultValue = "null")String name , Model model) {
		Subject subject = subjectService.findOneSubject();
		model.addAttribute("justObject", subject);
		return "subject";
	}
}
