package com.tom;

public class Weightcon {
	
	double catty;
	public Weightcon(double catty) {
		this.catty = catty;
		//catty = »O¤ç
	}
	
	public double g(){
		double g =(600*catty);
		return g;
	}
	
	public double kg() {
		double kg;
		return kg =(0.6*catty);
	}
	
}
