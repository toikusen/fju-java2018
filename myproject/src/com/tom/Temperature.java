package com.tom;

public class Temperature {
	
	double Celsius;
	
	public Temperature(double Celsius){
		this.Celsius = Celsius;
		
	}
	public double Fahrenheit(){
		double Fahrenheit = (Celsius*(9.0/5.0)+32);
		return Fahrenheit;
	}
	public double Kelvin(){
		double Kelvin = Celsius+273.15;
		return Kelvin;
		
	}
}
