package com.tom;

import java.util.Scanner;

public class Temp {

	public static void main(String[] args) {
		
	/*	System.out.print("Please enter the temperature(Celsius):");
		Scanner scanner = new Scanner(System.in);
		double c = scanner.nextDouble();
		Temperature temp = new Temperature(c);
		System.out.printf(" \" %.1f C = %.1f F \" \n Kelvin: %.1f K",
				temp.Celsius,temp.Fahrenheit(),temp.Kelvin());*/
		
		System.out.print("What is your age? "); 
		Scanner in = new Scanner(System.in);
		int age = in.nextInt(); in.nextLine();
		// read the newline 
		System.out.print("What is your name? "); 
		String name = in.nextLine();
		System.out.printf("Hello %s, age %d\n", name, age);

	}


}
