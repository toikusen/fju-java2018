package com.aaa;

import java.util.Scanner;

public class ScoreTester {

	public static void main(String[] args) {
		int math = 0;
		int english = 0;
		Scanner scanner = new Scanner(System.in);
		int div = 0;
		try {
		System.out.print("數學幾分？");
		Scorecon mathscore = new Score(scanner.nextLine());
		System.out.print("英文幾分？");
		Scorecon englishscore = new Score(scanner.nextLine());
		
		System.out.print("平均 +  %.1f, ScoreTester.score() + 分");
		}
		 catch(Exception e) {
				System.out.println("資料錯誤");
			}	
	}
}