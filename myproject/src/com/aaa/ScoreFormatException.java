package com.aaa;

public class ScoreFormatException extends Exception{

	@Override
	public String getMessage() {
		return "Enter format invaid,can't convert to int";
	}
	
	
}
