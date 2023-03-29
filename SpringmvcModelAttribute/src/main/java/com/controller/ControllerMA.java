package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Controller
public class ControllerMA {
	
	@RequestMapping(value="/login")
	public String hello(@ModelAttribute User u){
		
		System.out.println(u);
		return "ddd";
	}

}
