package com.cozentus.UserInformation.Bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserMain {
	
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/cozentus/UserInformation/Bean/beanfile.xml");
		UserDetails user = (UserDetails) ac.getBean("collection");
		System.out.println(user);
		
	}
}
