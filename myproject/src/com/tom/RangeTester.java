package com.tom;

import java.util.Scanner;

public class RangeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please import an int");	
		int i = scanner.nextInt();
		scanner.nextLine();
		if (i >= -3 && i <= 5){
				System.out.println(i+"\t"+ "is between -3 and 5"+"\t"+  "true");
			}
			else{
				System.out.println(i+"\t"+ "isn't between -3 and 5"+"\t"+  "false");
			}
		}

} 