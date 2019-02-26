package com.tom.aaa;

public class Father {
	String name;
	int birthday;
	public Father() {
		
	}
	
	public Father(String name,int birthday) {
		this.name = name;
		this.birthday = birthday;
				
	}
	
	public void print() {
		System.out.print(name + birthday + "/n");
	}
	
    public String getName() {
        return name;
    }
}
