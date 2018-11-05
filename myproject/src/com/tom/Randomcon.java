package com.tom;

import java.util.Scanner;

public class Randomcon {

	boolean number;
	int a;
	int max;
	int min;
	int secret;
	
	public Randomcon(boolean number){
		this.number = number;	
		

	}
	
	public Randomcon(int a,int max,int min,int secret) {
		this.a = a;
		this.max = max;
		this.min = min;
		this.secret = secret;
		
	
	}
	public void enter() {
		

	Scanner print = new Scanner(System.in);
	int a = print.nextInt();
	if( a == secret) {
    System.out.println("You are right.");	
    	
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
