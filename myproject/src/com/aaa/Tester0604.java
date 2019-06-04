package com.aaa;

public class Tester0604 {

	public static void main(String[] args) {
		System.out.println("Good Moring!");
		Breakfast0604 bf = new Breakfast0604();
		bf.start();				
		BrushTeeth0604 bt = new BrushTeeth0604();
		Thread thread = new Thread(bt);
		thread.start();
		try {
			thread.join();
			bf.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Main end");
	}

}
