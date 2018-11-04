package com.tom;

import java.util.Scanner;

public class THSR {

	public static void main(String[] args) {
		
		System.out.println("Mom said:How much do people take THSR form Taipei to Miaoli.");
		System.out.println("Enter your age.");
		
		while(true) {
			Scanner scanner = new Scanner(System.in);
			int age = scanner.nextInt();
			THSRcon THSR = new THSRcon(age);
			if(age < 18) {
				System.out.printf("孩童票:%.1f dollars",THSR.childticket());
			}
			else if(age > 65) {
				System.out.printf("老人票:%.1f dollars ", THSR.oldticket());
				
			}
			else if(age > 18 && age < 65){
				System.out.printf("全票: %d  dollars" ,THSR.fullticket);
			}
		}
		
	}

}
