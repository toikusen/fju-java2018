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
	public void print() {
		int average = getAverage();
		System.out.print(name + "\t" + english + "\t" + math + "\t");
		System.out.print(average + "\t" + highest() + "\t" +
				((average < 60) ? "FAILED" : "PASS"));
		
		
		System.out.println("\t"+getGrading());
	}
	
	public char getGrading() {
		char grading = 'F';
		int average = getAverage();
		switch(average/10) {
		case 10:
		case 9:
			grading = 'A';
			break;
		case 8:
			grading = 'B';
			break;
		case 7:
			grading = 'C';
			break;
		case 6:
			grading = 'D';
			break;
		default:
			grading = 'F';
				
		}
		
		
		/*
		
		if (average >= 90 && average <= 100) {
			grading = 'A';
		} else if (average >= 80 && average <= 89) {
			grading = 'B';
		} else if (average >= 70 && average <= 79) {
			grading = 'C';
		} else if (average >= 60 && average <= 69) {
			grading = 'D';
		}
		*/
		return grading;
	}

	public int highest() {
		if (english > math) {
			return english;
		} else {
			return math;
		}
	}

	public int getAverage() {
		return (english + math) / 2;
	}
}
