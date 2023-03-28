package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
@Controller
public class HellonoController {
	
	@RequestMapping	(value = "/hello")
	public String hello() {
	System.out.println("HELLO in controller java class");
		return "welcome";
	}
	@RequestMapping	(value = "/A")
	public String yes()
	{
		return "A";
	}
	
	
}
