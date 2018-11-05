package com.tom;

import java.util.Scanner;

public class Random {

	public static void main(String[] args) {
		
		System.out.print("Please enter a number,which from 1 to 100.\n");
		
		Scanner print = new Scanner(System.in);
		int a = print.nextInt();
		
		boolean number = true;
		Randomcon randomcon = new Randomcon(number);
		if (randomcon.number) {
			randomcon.enter();
		}
		
	}
	
}
