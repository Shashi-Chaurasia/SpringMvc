package com.springmvc.SearchEngine;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	
	@RequestMapping("/")
	public String searchEngine() {
		return "home";
		
	}
	
	
	@RequestMapping("/search")
	public RedirectView searchView(@RequestParam("query") String query) {
		String url = "https://www.google.com/search?q="+query;
		/* model.addAttribute("query", query); */
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(url);
		return redirectView;
		
	}

}
