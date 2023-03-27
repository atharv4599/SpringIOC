package com.main.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.main.model.Product;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ap=new ClassPathXmlApplicationContext("bean.xml");
		Product p=ap.getBean("pr",Product.class);
		System.out.println(p.getpId());
		System.out.println(p.getpName());
		System.out.println(p.getpPrice());
		System.out.println(p.getLd());
		System.out.println(p.getMs());
	}

}
