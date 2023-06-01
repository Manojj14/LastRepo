package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("1")
public class Amazon extends Company  {
	void show() {
		System.out.println("user working in a amazon.....");
	}
	
	

}
