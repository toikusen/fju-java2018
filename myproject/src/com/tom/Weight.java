package com.tom;

import java.util.Scanner;

public class Weight {

	public static void main(String[] args) {
		
		System.out.println("Please print the weight.");
		Scanner user = new Scanner(System.in);
		double num = user.nextDouble();
		Weightcon Weight = new Weightcon(num);
		System.out.printf(" \" Your weight is %.1f catty = %.1f g   \" \n also = %.1f kg",
				Weight.catty,Weight.g(),Weight.kg());

	}

}
