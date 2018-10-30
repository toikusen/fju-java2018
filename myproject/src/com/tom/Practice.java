package com.tom;

import java.util.Random;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		int n = (int)(3/5.0);
		int m = 5%3;
		System.out.println(n);
		System.out.println(m);*/
		
		String name = "Daniel";
		int m =18;
		System.out.printf("Hi , %s , Your age: %d\n ",name , m);
		
		double c = 24.0;
		double f = c*(9/5.0)+32;
		System.out.printf("\"  %.1f C = %.1f F  \"\n",c,f);
		
		//int n = 1;
			//while (n>0)
			//System.out.println("AAAAAAAAAAAA");
		 
		Random a = new Random();
		System.out.println(a.nextInt(100)+1);
	
	}

}
