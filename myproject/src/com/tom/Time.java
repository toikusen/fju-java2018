package com.tom;

import java.util.Scanner;

public class Time {

	public static void main(String[] args) {
		double hour = 18.0;
		double min = 49.0;
		double sec = 20.0;
		double starttime = (hour*3600 + min*60 + sec);
		double percenttime =  ((starttime)/(24*3600)*100);
	
		System.out.print("The number of seconds since midnight:");
		System.out.println(((hour*60)+min)*60+sec);
		
		System.out.print("The number of seconds remaining in the day:");
		System.out.println((60-sec)+(60-49-1)*60+((24-18-1)*3600));
		
		System.out.print("The percentage of the day that has passed:");
		System.out.printf("%.2f",percenttime);
		System.out.println("%");
		
		System.out.println("Enter the current time:");
		System.out.print("Hour:");
		Scanner in = new Scanner(System.in);
		int Hour = in.nextInt();
		System.out.print("Min:");
		int Min = in.nextInt();
		System.out.print("Sec:");
		int Sec = in.nextInt();
		System.out.print("THe current time:");
		System.out.printf("%d : %d : %d\n",Hour ,Min, Sec);
		System.out.print("The elapsed time since I started working on this exercise:");
		
		double nowtime = (Hour*3600 + Min*60 + sec);
		System.out.println(nowtime-starttime + "sec" +"\f"+ "=" + "\f"+ (nowtime-starttime)/60 + "min");
		
		
		
	}

}
