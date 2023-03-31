package com.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerHome {
	List<User> users = new ArrayList<>();

	@RequestMapping	(value = "/login")
	public String logincheck(@RequestParam String username,@RequestParam String password,@ModelAttribute User u,Model m){

		for(User user:users) {
			if(username.equals(user.getUsername()) && password.equals(user.getPassword())) {
				m.addAttribute("data",users);
				return "welcome";
			}
		}
		return "unf";

	}
	@RequestMapping	(value = "/register")
	public String loginnew(@ModelAttribute User u,Model m) {
		users.add(u);
		m.addAttribute("data", users);	
		return "login";
	}
}
