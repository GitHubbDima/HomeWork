package com.step.model.appliances;

import java.util.Random;

public class Refrigerator {
    private boolean alimentation ;
    private final int normal_temperature = 4;

    public void freeze(){
        Random random = new Random();
        int temperature = 8;

        while(temperature > this.normal_temperature){
            alimentation = true;
            System.out.println("temperature: " + temperature);
            temperature--;
        }
    }
    public void doorCheck(String condition){
        if (condition == "open"){
            this.alimentation = false;
            System.out.println("door is open");
        }
        else{
            this.freeze();
        }
    }
}
