package com.model;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controllerp {
	@RequestMapping	(value = "/login")
	public String logincheck(@ModelAttribute User u,@RequestParam("username") String username,@RequestParam("password") String password,Model m){
		
		m.addAttribute("u", u);
	
		return "welcome";
	}


}
