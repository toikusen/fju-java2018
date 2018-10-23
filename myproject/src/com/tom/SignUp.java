package com.tom;

import java.util.Scanner;

public class SignUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Are you 18?(Y/N)");
		String line = scanner.nextLine();
		boolean adult = line.equals("y");
	}

	

}
