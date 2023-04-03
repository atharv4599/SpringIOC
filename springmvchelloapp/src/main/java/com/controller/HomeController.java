package com.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {	
	@RequestMapping	(value = "/")
	public String preLogin() {
	System.out.println("open login page");
		return "login";
	}
	@RequestMapping	(value = "/openregister")
	public String preRegister()
	{
		System.out.println("Register login page");
		return "register";
	}
	
	
}
