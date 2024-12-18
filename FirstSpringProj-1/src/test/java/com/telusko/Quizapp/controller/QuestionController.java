package com.telusko.Quizapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Question")
public class QuestionController {
	@GetMapping("/allQuestion")
public String GetAllQuestion() {
	return "Hello First Project";
}
	
}
