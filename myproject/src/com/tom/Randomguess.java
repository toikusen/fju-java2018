package com.tom;

import java.util.Random;
import java.util.Scanner;

public class Randomguess {

	public static void main(String[] args) {
		Random ans = new Random();
		int secret = ans.nextInt(100+1);
		System.out.println(secret);
		
		System.out.print("Please enter a number,which from 1 to 100.\n");
		
		
		int max = 100;
	    int min = 1;
	    
	    while(true) {
	    
		Scanner print = new Scanner(System.in);
		int a = print.nextInt();
			
		
		if( a == secret) {
	    System.out.println("You are right.");	
	    	break;
	    }
		
		else if (a < secret ) {
			System.out.println("The number is from " + a + "~" + max);
			min = a;
	    }
	    
		else if(a > secret){
			
			System.out.println("The number is from " + min + "~" + a);
			max = a;
		}
		
	    }
	}
}
