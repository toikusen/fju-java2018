package com.tom;

public class Cube {
	int length;
	int width;
	
	public Cube(int length,int width) {
		this.length = length;
		this.width = width;
		
	}
	public void cube() {
		System.out.println("Hello");
	}
	
	public double area() {
		double area = length*width;
		return area;
	}
}
