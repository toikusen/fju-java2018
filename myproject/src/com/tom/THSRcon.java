package com.tom;

public class THSRcon {

	int fullticket = 430;
	public THSRcon(int fullticket) {
	//加入 this.fullticket = fullticket 程式就會用輸入的數值去運算
	}
	
	public double childticket() {
		double childticket = (0.5*fullticket);
		return childticket;
	}
	
	public double oldticket() {
		double oldticket = (0.5*fullticket);
		return oldticket;
	}
	
}
