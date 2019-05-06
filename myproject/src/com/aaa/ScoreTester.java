package com.aaa;

import java.util.Scanner;

public class ScoreTester {

	public static void main(String[] args) {
		int average;
		Scanner scanner = new Scanner(System.in);
		int div = 0;
		try {
		System.out.print("數學幾分？");
		Score mathscore = new Score(scanner.nextLine());
		System.out.print("英文幾分？");
		Score englishscore = new Score(scanner.nextLine());
		average = (mathscore.value + englishscore.value)/2;
		System.out.println(average);
		}
		 catch(Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}	
	}
}