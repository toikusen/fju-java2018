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
//		jack hello();
		
		
		Person p = new Person(68.5f,1.77f);
//		p.weight = 68.5f;
//		p.height = 1.77f;
		System.out.println(p.bmi());
		p.hello();
//		Person hank = new Person();
//		Person jack = null;
//		jack.hello();
		
		/*System.out.println("Hello world");
		int age = 18;
		String name = "Yu Cheng Tu";
		float weight = 67.5f;
		int high = 177;
		char h ='H';
		char i ='I';
		String information = "I like to make friends.";
		System.out.print("My name is:");
		System.out.println(name);
		System.out.print("Age:");
		System.out.println(age);
		System.out.print("Weight:");
		System.out.println(weight);
		System.out.print("High:");
		System.out.println(high);
		System.out.print(h);
		System.out.println('~');
		System.out.print(i);
		System.out.println("~~");
		System.out.println("~~~");
		System.out.println(information);*/
		
	}

}
