package com.step.model.bicycle;

import java.util.Scanner;

public class Pump {
    private final String[] pumpType = {"car", "bicycle", "portable"};
    private int speedPump;

    public String getPumpType() {
        String pumpType = this.pumpType[0];
        for (int i = 1; i < this.pumpType.length; i++) {
           pumpType += (", " + this.pumpType[i]);
        }
        return pumpType ;
    }

    public int usePump(int pumpWheel, int maxPressure){

        Scanner in = new Scanner(System.in);
        int number;
        System.out.println(" Select your type wheel.");
        System.out.println("1." + this.pumpType[0]);
        System.out.println("2." + this.pumpType[1]);
        System.out.println("3." + this.pumpType[2]);
        number = in.nextInt();

        if(number == 1){
            speedPump = 5;
        }
        else if(number == 2){
            speedPump = 10;
        }
        else if(number == 3){
            speedPump = 2;
        }
        else{
            System.out.println(" you have not selected anything from the list. ");
        }

        if(number == 1 || number == 2 || number == 3){
            do {
                pumpWheel +=speedPump;
            }while (pumpWheel < maxPressure);
        }

        if(pumpWheel == maxPressure){
            System.out.println("Your wheel is inflated. ");
        }
        return pumpWheel;
    }
}
