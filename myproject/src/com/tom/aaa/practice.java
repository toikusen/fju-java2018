package com.tom.aaa;

import java.util.HashMap;
import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		HashMap<String,Integer> item = new HashMap<>();
		Scanner scanner = new Scanner(System.in);
		
		String name = "";
		while (! name.equals("q")) {
			System.out.print("Please enter item name:(enter q:break)");
			name = scanner.nextLine();
			if (name.equals("q")) {
				break;
			}
			System.out.print("Please enter number:");
			Integer number = Integer.parseInt(scanner.nextLine());
			item.put(name, number);
			System.out.println(item);	
			
			}
			 	
		}
	
}
