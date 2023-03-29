package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Controller
public class ControllerClass {
	@RequestMapping	(value = "/login")
	public String logincheck(@RequestParam String username,@RequestParam String password){
	System.out.println("Username "+ username);
	System.out.println("Password "+ password);
		return "welcome";
	}
}
