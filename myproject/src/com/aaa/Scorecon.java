package com.aaa;

public class Scorecon {

	String s;
	String mathscore;
	String englishscore;
	
	public Scorecon (String mathscore, String englishscore) {
		this.mathscore = mathscore;
		this.englishscore = englishscore;
	}
	

	public double score() {
		double score = Integer.parseInt(englishscore+mathscore)/2;
		return score;
	}
	
}
