package com.tns.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Config loaded");
		
		Sim s= c.getBean("sim",Sim.class);
		s.calling();
		s.data();
		
	}

}
