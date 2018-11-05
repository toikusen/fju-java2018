package com.tom;

import java.util.Random;
import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {


		System.out.print("Please enter a number,which from 1 to 100.\n");
		
		
		boolean number = true;
		Randomcon g = new Randomcon (number);
		Random random = new Random();
		int secret = random.nextInt(100+1);
		g.max = 100;
		g.min = 0;
		System.out.println(secret);
		while (number) {
			g.enter();
		}
	}

}
