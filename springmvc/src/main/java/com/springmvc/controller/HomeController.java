package com.springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home(Model model){
		
		System.out.println("Reloding.......");
		
		model.addAttribute("name", "Shashi Chaurasia");
		
		List<String> friends = new ArrayList<String>();
		friends.add("Ram");
		friends.add("Sailesh");
		friends.add("joe");
		friends.add("danesh");
		model.addAttribute("f", friends);
		
		return "index";
	}
	@RequestMapping("/help")
	public ModelAndView help() {
		
		System.out.println("We are in help page");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name", "Ramu");
		modelAndView.addObject("rollno", 76);
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time", now);
		
		List<Integer> marks = new ArrayList<Integer>();
		marks.add(23);
		marks.add(487);
		marks.add(63);
		marks.add(78);
		marks.add(373);
		modelAndView.addObject("marks" , marks);
		
		modelAndView.setViewName("help");
		
		return modelAndView;
		
	}
}
