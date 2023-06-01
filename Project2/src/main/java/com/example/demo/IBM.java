package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("2")
public class IBM extends Company
{
	void show() {
		System.out.println("user working in IBM.....");
	}

}
