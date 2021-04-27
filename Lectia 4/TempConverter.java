package com.step.converter;
import java.util.Scanner;

public class TempConverter{
	
	public void convertToFahr(double celsius){
		System.out.println( celsius + " Celsius = " + ((celsius*1.800) + 32) + " Fahr." );
	}
	
	public void convertToFahr(){
			
		Scanner in = new Scanner(System.in);	 
		
		System.out.print("Please enter degrees celsius: ");
		double celsius = in.nextDouble();
		
		System.out.println( celsius + " Celsius = " + ((celsius*1.800) + 32) + " Fahr." );
	}
	
	public void convertToCelsius(double fahr){
		System.out.println( fahr + " fahr = " + ((fahr - 32) /1.800) + " celsius." );
	}
}