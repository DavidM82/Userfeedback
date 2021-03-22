package com.example.UserFeedback.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.UserFeedback.entities.Feedback;


@Controller
public class TestFormController {

	@Autowired FeedbackController feedbackController;
	
	 @GetMapping(value="/testform")
     public String showTestForm(ModelMap model) {
		 model.addAttribute("feedback", new Feedback());
		 return "testform";
     }
	 
	// @PostMapping("/testform")
	// TODO: implement form submission
	// TODO: add View JSP
	// TODO: Call RestTemplate and make POST json request to localhost:8090/feedback
	 @PostMapping("/testform")
	 public String handleTestForm(ModelMap model, @RequestParam(value="name") String name, @RequestParam(value="rating") int rating, @RequestParam(value="comments") String comments) {
		 System.out.println("this works: " + name + "," + rating + "," + comments);
		 Feedback input = new Feedback(name, rating, comments);
		 feedbackController.addNewFeedback(input);
		 return "testform";
	 }
}
