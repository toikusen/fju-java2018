package com.aaa;

public class Wizard extends Thread{
	public void thunder() {
	synchronized (this) {
		
	
	System.out.println("THUNDER START");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("THUNDER END");
	}
}
	@Override
	public void run() {
		thunder();
	}
	
	public static void main(String[] atgs) {
		Wizard w1 = new Wizard();
		w1.start();
		Wizard w2 = new Wizard();
		w2.start();
	}
	
}
