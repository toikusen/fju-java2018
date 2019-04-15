package com.tom;

public class Student {
	String name;
	int english;
	public Student() {
		
	}
	
	public Student(String name, int english) {
	this.name = name;
	this.english = english;
	
	}
	
	public void print() {
		System.out.print(name + "/t" + english);	
	}	
	
	public void setEnglish(int english) {
		if (english <= 100 && english >= 0)
			this.english = english;
	}
}
