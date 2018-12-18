package com.tom;

public class Stringtest {

	public static void main(String[] args) {
		int n = 100;
		System.out.println(n != 99);
		String s  = "Hello world";
		
		String s2 = new String("Hello world");
		System.out.println(s == s2);
		System.out.println(s.substring(8));
		System.out.println(s.substring(2, 7));
		
		System.out.print(s.substring(10));
		System.out.print(s.substring(9,10));
		System.out.println(s.substring(8,9));
		
			for (int i = s.length()-1; i>=0; i--){
				System.out.print(s.charAt(i));
			}
		System.out.println();
			
		String s3 = new String("Jack Tom Eric");
		System.out.println(s3.indexOf("T"));
		String name = "Tom";
		
		System.out.println(s3.replace("Tom","boss"));
		
		int index = s3.indexOf(name);
		System.out.println(s3.substring(0, index) + "boss"
		+ s3.substring(index + name.length()));
		
		System.out.println(s3.substring(0, index) + "boss"
		+ s3.substring(8,13));
	}

}
