package com.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.model.Student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource r = new ClassPathResource("Bean.xml");
		BeanFactory bf = new XmlBeanFactory(r);
		Student s = (Student) bf.getBean("s");
		s.display();
		Student s1 = (Student) bf.getBean("s");
		System.out.println("First Object"+  s );
		System.out.println("Second Object"+  s1 );
		
		
	}

}
