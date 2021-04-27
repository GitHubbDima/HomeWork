package com.step.comparator;

public class NumbersComparator{
	
	public double bigger(double number1, double number2){
		
		return number1 > number2 ? number1 : number2;
	}
	
	public double smaller(double number1, double number2){
		
		return number1 > number2 ? number2 : number1;
	}
}