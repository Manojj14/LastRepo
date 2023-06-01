package com.example.demo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
//import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value="prototype")
public class User {
//	User(){
//		System.out.println("user con......!!!!");
//	}
	@Autowired
	//@Qualifier("2")
	Company c;
	
	
	void display() {
		System.out.println("spring boot application running");
	c.show();

	}

}
