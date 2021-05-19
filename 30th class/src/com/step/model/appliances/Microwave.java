package com.step.model.appliances;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Microwave {
    private int power;
    private final int stoped = 1;

    Scanner in = new Scanner(System.in);

    public void setPower() {

        System.out.println("  1. 600W ");
        System.out.println("  2. 800W ");
        System.out.println("  3. 1200W ");
        System.out.println("  4. 1600W ");
        System.out.print(" Select the power: ");
        int number ;

        do{
            number = in.nextInt();
            switch (number){
                case 1: { this.power = 600; break; }
                case 2: { this.power = 800; break; }
                case 3: { this.power = 1200; break; }
                case 4: { this.power = 1600; break; }
                default: { System.out.print(" Selcet in the list. ");}
            }
        }while(number > 4 || number < 1);
    }

    public void timer(int seconds){
        for (int i = 1; i < seconds+1; i++){
            System.out.print(" " + i);
            try{
                TimeUnit.SECONDS.sleep(stoped);
            }
            catch (InterruptedException ie){
                ie.getCause();
            }
        }
    }
}
