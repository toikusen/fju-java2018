package com.tom;

import java.util.Random;

public class PokerGame {

	public static void main(String[] args) {
		Random random = new Random();
		int num = random.nextInt(12)+1;
		System.out.print(num);
		
		int colar = random.nextInt(3);
		switch(colar){
		case 0 :
			System.out.print("S");
			break;
		case 1:
			System.out.print("H");
			break;
		case 2:
			System.out.print("D");
			break;
		case 3:
			System.out.print("C");
			break;
			
		}
		
		/*
		
		if(colar == 0){
			System.out.print("S");	
			}
		else{
			if(colar == 1){
				System.out.print("H");
			}
			else{
				if(colar == 2){
					System.out.print("D");
				}
				else{
						System.out.print("G");
					}
		}*/
		
		}
	
}
