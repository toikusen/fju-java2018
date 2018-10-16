package com.tom;

public class Score {
	String name;
	int english;
	int math;
	
	public Score(String name,int english, int math) {
		this.name = name;
		this.english = english;
		this.math = math;
	}

	public void hello() {
		System.out.println("Hello");

	}

	public int score() {
		int score = (english+math)/2;
		return score;
	}
}
