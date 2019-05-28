package com.aaa;

public class Horse extends Thread {
	
	public Horse(String name) {
		setName(name);
	}
	@Override
	public void run() {	
		
		try {
		for (int i = 1; i<=100; i++) {
			StringBuilder spaces = new StringBuilder();
			for(int j = 0; j<i ; j++) {
				spaces.append(" ");
			}
			
		System.out.println(getName() +spaces.toString() + i);
		sleep(100);
	}
		} catch (InterruptedException e) {	
			e.printStackTrace();
		}
		//super.run();
	}


}
