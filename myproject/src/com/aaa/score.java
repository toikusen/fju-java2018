package com.aaa;

import java.util.Scanner;

public class score {

	public static void main(String[] args) {
		int math = 0;
		int english = 0;
		Scanner scanner = new Scanner(System.in);
		int div = 0;
		System.out.print("數學幾分？");
		String mathscore = scanner.nextLine();
		System.out.print("英文幾分？");
		String englishscore = scanner.nextLine();
		try {
			int a = Integer.parseInt(mathscore);
			int b = Integer.parseInt(englishscore);
			div = (a+b)/2;
			System.out.print("平均" + div + "分");
		}
		 catch(Exception e) {
				System.out.println("資料錯誤");
			}	
	}
}