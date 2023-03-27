package com.main.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.main.model.Student;



public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("Bean.xml");
		Student s=ac.getBean("s",Student.class);
		System.out.println(s.getRollno());
		System.out.println(s.getName());
		System.out.println(s.getCity());

	}

}
