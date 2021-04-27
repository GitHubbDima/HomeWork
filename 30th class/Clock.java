package com.step.model;

public class Clock{
	
	String time;
	int hour;
	
	public void setHour(int h){
		this.hour = h;
	}
	
	public void showTime(){
		
		if( hour > 5 && hour < 11 ){
			time = " morning ";
			System.out.println(time);
		}
		else if( hour > 11 && hour < 17 ){
			time = " day ";
			System.out.println(time);
		}
		else if( hour > 17 && hour < 21 ){
			time = " evening ";
			System.out.println(time);
		}
		else{
			time = " night ";
			System.out.println(time);
		}
	}
}