package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Project2Application {

	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Project2Application.class, args);
		User u=context.getBean(User.class);
		//User u1=context.getBean(User.class);
		u.display();
//	System.out.println(u+" "+u1);
//		System.out.println();
//		System.out.println();
//	  System.out.println();
//		
		}
	
		
	}


