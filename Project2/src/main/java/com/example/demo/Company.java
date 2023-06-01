package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Company {
	
	void show() {
		System.out.println(" user working in a company");
	}

}
