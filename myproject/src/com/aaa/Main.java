package com.aaa;

public class Main {

	public static void main(String[] args) {
		Horse h1 = new Horse("H1:");
		h1.start();
		
		Horse h2 = new Horse("H2:");
		h2.start();
		//HorseRunnable h1 = new HorseRunnable();
		//Thread thread = new Thread(h1);
		//thread.start();
		System.out.println("main end");

	}

}
