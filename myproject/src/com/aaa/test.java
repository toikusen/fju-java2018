package com.aaa;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		int bonus = 10000000;
		Scanner scanner = new Scanner(System.in);
		int div = 0;
		boolean a = false;
		while(a==false){
		System.out.print("分給多少人？");
		String people = scanner.nextLine();
		try {
			int n = Integer.parseInt(people);
			div = bonus/n;
			System.out.print("一個人分到" + div);
		}
		 catch(Exception e) {
				System.out.println("資料錯誤");
			}	
		/*catch(ArithmeticException e) {
			System.out.println("數值運算錯誤");
		}catch(NumberFormatException e) {
			System.out.println("數字格式錯誤");
		}*/
		}

	}

}
