package com.sxy.spring.bean;

public class Color {
	
	private Car2 car;

	public Car2 getCar() {
		return car;
	}

	public void setCar(Car2 car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "Color [car=" + car + "]";
	}
	
	

}
