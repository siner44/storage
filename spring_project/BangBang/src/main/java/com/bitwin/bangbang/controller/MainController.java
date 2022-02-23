package com.bitwin.bangbang.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import lombok.AllArgsConstructor;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/*")
@AllArgsConstructor
public class MainController {
	
	
	@GetMapping
	public void mainpage() {
		

		
	}
	
}
