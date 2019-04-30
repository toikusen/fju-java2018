package com.aaa;

public class ScoreFormatException extends Exception{

	@Override
	public String getMessage() {
		return "Can't convert to int";
	}
	
	
}
