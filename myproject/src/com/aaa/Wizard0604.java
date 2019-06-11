package com.aaa;

public class Wizard0604 extends Thread{
	public static synchronized void thunder() {
	
	System.out.println("THUNDER START");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("THUNDER END");
	}
	@Override
	public void run() {
		thunder();
	}
	
	public static void main(String[] atgs) {
		Wizard0604 w1 = new Wizard0604();
		w1.start();
		Wizard0604 w2 = new Wizard0604();
		w2.start();
	}
	
}
