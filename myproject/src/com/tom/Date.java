package com.tom;

public class Date {

	public static void main(String[] args) {
		String day = "Sunday";
		int date = 4;
		String month = "November";
		int year = 2018; 
		System.out.println("American format:");
		System.out.print(day +","+ "\f"+  month + "\f");
		System.out.printf("%02d",date);
		System.out.println("," + "\f"+  year);
		System.out.println("European format:");
		System.out.print(day + "\f");
		System.out.printf("%02d",date);
		System.out.println("\f" + month +"\f"+ year );
	}

}
