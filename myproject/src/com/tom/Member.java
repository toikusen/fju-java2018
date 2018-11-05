package com.tom;

import java.util.Scanner;

public class Member {
	boolean adult;
	int age;
	String name;
	String nickName;
	public Member(boolean adult){
		this.adult = adult;
	}
	public Member(int age, String name, String nickname) {
		this.age = age;
		this.name = name;
		this.nickName = nickname;
	}
	
	public void startInput(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Your age?");
		age = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Your name?");
		name = scanner.nextLine();
		System.out.print("Your nick name?");
		nickName = scanner.nextLine();
		System.out.println("Your basis data is age:" + age +"\f"+ "name:" + name +"\f" + "nickName:" + nickName);
	}
}
