package com.model;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Controller
public class ControllerModel {
	
	@RequestMapping	(value = "/login")
	public String logincheck(@RequestParam("username") String u,@RequestParam("password")String p,Model m){
	System.out.println("Username "+ u);
	System.out.println("Password "+ p);
	System.out.println("Rollno "+ 10);
	m.addAttribute("username",u);
	m.addAttribute("password",p);
	m.addAttribute("rollno", 10);
	
		return "welcome";
	}

}
