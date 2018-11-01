package com.tom;

import java.util.Random;
import java.util.Scanner;

public class Randomguess {

	public static void main(String[] args) {

	 
	Random ans = new Random();
	int secret = ans.nextInt(100+1);
	System.out.println(secret);
	
	System.out.print("Please enter a number,which from 1 to 100.\n");
	Scanner print = new Scanner(System.in);
	
	int a = print.nextInt();
	int max = 100;
    int min = 1;
    
	if (a == secret ) {
	System.out.println("You are right.");
	}
	
	
	else if (a < secret ) {
	min = a;
	while (a < secret) {
		System.out.println("The number is from " + a + "~" + max);
		if (a<secret)
			break;
		Scanner newprint = new Scanner(System.in);
		int num = newprint.nextInt();
	}
		
		
	}
	}  
	
	
	/*else {
	System.out.println("The number is from" + min + "~" + a );
	max = a;
	while (a > secret) {
		System.out.println("The number is from " + min + "~" + a);
	}
	
	

	}*/
	
}
