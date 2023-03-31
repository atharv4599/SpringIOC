package com.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Controller
public class ControllerModelMap {
	
	@RequestMapping	(value = "/login")
	public String logincheck(@RequestParam("username") String u,@RequestParam("password")String p,ModelMap m){
	List<String> names = new ArrayList<>();
	names.add(u);
	names.add(p);
	m.addAttribute("name", names);

	for (String s : names)
	{
		System.out.println(s);
	}
		return "welcome";
	}

}
