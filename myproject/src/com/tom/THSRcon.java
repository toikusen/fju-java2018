package com.tom;

public class THSRcon {

	int fullticket = 430;
	public THSRcon(int fullticket) {
	//�[�J this.fullticket = fullticket �{���N�|�ο�J���ƭȥh�B��
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
