package com.step;

import java.util.Scanner;
import com.step.converter.TempConverter;
import com.step.calculator.Calculator;
import com.step.comparator.NumbersComparator;
import com.step.model.Clock;

public class App{
	
	public static void main(String[] args){
		
		/*
		TempConverter tempConverter = new TempConverter();
		tempConverter.convertToFahr();
		tempConverter.convertToFahr(100);
		tempConverter.convertToCelsius(98.6);
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.println();
		System.out.println(" Please enter numberX and numberY for operation: ");
		System.out.print(" numberX = ");
		double numberX = in.nextDouble();
		
		System.out.print(" numberY = ");
		double numberY = in.nextDouble();
		
		Calculator calculator = new Calculator();
		
		System.out.println( " gathering: " + calculator.gathering(numberX, numberY) );
		System.out.println( " decreased: " + calculator.decreased(numberX, numberY) );
		System.out.println( " multiplying: " + calculator.multiplying(numberX, numberY) );
		System.out.println( " division: " + calculator.division(numberX, numberY) );
		
		NumbersComparator numbersComparator = new NumbersComparator();
		
		System.out.println( " bigger number is : " + numbersComparator.bigger(numberX, numberY));
		System.out.println( " smaller number is : " + numbersComparator.smaller(numberX, numberY));
		*/
		
		Scanner in = new Scanner(System.in);
		
		Clock clock = new Clock();
		
		clock.setHour(14);
		clock.showTime();
	}
}