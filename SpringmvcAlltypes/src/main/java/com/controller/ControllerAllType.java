package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Controller
public class ControllerAllType{
	
	@RequestMapping(value="/login")
	public String hello(@ModelAttribute User u){
		
		System.out.println(u);
		return "ddd";
	}
	@RequestMapping(value="/login/{username}/{password}")
	public String hello(@PathVariable("username")String u,@PathVariable("password")String p){
		
		System.out.println("Username "+ u);
		System.out.println("Password "+ p);
		return "ddd";
	}
	@RequestMapping	(value = "/login")
	public String logincheck(@RequestParam String username,@RequestParam String password){
	System.out.println("Username "+ username);
	System.out.println("Password "+ password);
		return "welcome";
	}

}
