package com.aaa;

import java.util.Scanner;

public class pizza {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("Please enter the prise of pizza:");
			int pizza = Integer.parseInt(scanner.nextLine());
			System.out.print("Please enter the prise of people:");
			int people = Integer.parseInt(scanner.nextLine());
			int prise = (pizza/people);
			System.out.println(prise);
		}catch(NumberFormatException e) {
			e.printStackTrace();
			
		}
	}

}
