package com.tom;

public class Exam {
	String name;
	int english;
	int math;
	
	public Exam() {
		
	}
	
	public Exam(String name, int english, int math) {
		this.name = name;
		this.english = english;
		this.math = math;
	}
	
	public void print() {
		System.out.println(name + "\t" + english + "\t" + math + "\t" + (english+math)/2);
	}
	public static void main(String[] args) {

		System.out.println("Hello");

	}

}
