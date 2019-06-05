package com.sxy.spring.bean;

import org.springframework.stereotype.Component;

@Component
public class Car2 {
	
	public Car2(){
		System.out.println("car constructor...");
	}
	
	public void init(){
		System.out.println("car ... init...");
	}
	
	public void detory(){
		System.out.println("car ... detory...");
	}

}
