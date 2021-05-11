package com.step.model.accessory;

public class Clock {

    private String time;
    private int hour;

    public void setHour(int hour){
        this.hour = hour;
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
