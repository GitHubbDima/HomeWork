package com.step;

import com.step.model.Clock;
import java.util.Scanner;

public class App{
	
	public static void main(String[] args){
				
		Scanner in = new Scanner(System.in);
		
		Clock clock = new Clock();
		clock.setHour(14);
		clock.showTime();
		
		
	}
}