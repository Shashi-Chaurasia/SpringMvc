package com.springmvc.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.springmvc.UserServices.UserService;
import com.springmvc.models.User;

@Controller


public class ConatctController {
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commonModel(Model model) {
		model.addAttribute("Header", "Your Detail : ");
		model.addAttribute("Desc", "Please conform your Detail");
	}
	
	@RequestMapping("/contact")
	public String contact() {
		 return "contact";
		
	}
	
	@RequestMapping(path = "/processForm" , method = RequestMethod.POST)
	public String formProcess(@ModelAttribute("user") User user, Model model) {
		
		
		if (user.getEmail().isBlank()) {
			return "redirect:/contact";
		}
		
		int createUser = this.userService.createUser(user);
		model.addAttribute("msg", "User created wit id " + createUser);
		
		
		return "form";
		
	}

}


//Method --- 1   ------
/*
public String formProcess(@RequestParam("email") String email,
		@RequestParam("password") String password, Model model) {
	
	System.out.println("Email of user : " + email);
	System.out.println("Password of user " + password);
	
	model.addAttribute("email", email);
	model.addAttribute("password", password);
	
	
	return "form";
	
}

*/

// Method ----- 2 ---------->
/*
@RequestMapping(path = "/processForm" , method = RequestMethod.POST)
public String formProcess(@RequestParam("email") String email,
		@RequestParam("password") String password, Model model) {
	
	
	User user = new User();
	
	user.setEmail(email);
	user.setPassword(password);
	model.addAttribute("user", user);
	return "form";
	
}*/
