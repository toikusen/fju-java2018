package com.tom;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Your name:");
		String s = scanner.nextLine();
		System.out.println(s);
		String name = "yu cheng";
		int english = 70;
		int math = 90;
		System.out.println(name + "\t" + english + "\t" + math +"\t" + (english+math)/2);
	
		
		Score stu = new Score("yu cheng",70,90);
//		stu.name ="yu cheng";
//		stu.english = 70;
		stu.math = 90;
		System.out.println(stu.score());
		stu.hello();
//		Student yu cheng = new Student();
//		Student jack = null;
//		jack.hello();
		
	
		Person p = new Person(68.5f,1.77f);
//		p.weight = 68.5f;
//		p.height = 1.77f;
		System.out.println(p.bmi());
		p.hello();
//		Person hank = new Person();
//		Person jack = null;
//		jack.hello();
		
		Cube c = new Cube(20,30);
//		c.length = 20;
//		c.width = 30;
		System.out.println(c.area());
		p.hello();
//		Cube cube = new Cube();
//		Cube jack = null;
//		jack.hello();
		 
		System.out.println("Are you 18? (Y/N)");
		Scanner age = new Scanner(System.in);
		String line = age.nextLine();
		boolean adult = line.toUpperCase().equals("Y");
		Member member = new Member(adult);
		if (member.adult) {
			member.startInput();
		}else {
			System.out.println("YOU, 881");
	}
	}
}
