package com.step.model.appliances;

import com.step.model.differently.Switch;

import java.io.OutputStream;
import java.util.Scanner;

public class TV {
    private String source;
    private int volume = 10;

    Scanner in = new Scanner(System.in);

    public void changeSource(){
        System.out.println("Select source:");
        System.out.println(" 1.HDMI. ");
        System.out.println(" 2.USB. ");
        System.out.println(" 3.TV channel. ");
        System.out.println(" 4.Youtube. ");
        System.out.println(" 5.Internet Explorer. ");
        System.out.println(" select: ");
        int number = in.nextInt();

        switch (number){
            case 1:{ this.source = "HDMI"; System.out.println(" Connected to " + this.source); break; }
            case 2:{ this.source = "USB"; System.out.println(" Connected to " + this.source); break; }
            case 3:{ this.source = "Tv channel" ;System.out.println(" Connected to " + this.source); break; }
            case 4:{ this.source = "Youtube"; System.out.println(" Connected to " + this.source); break; }
            case 5:{ this.source = "Internet Explorer"; System.out.println(" Connected to " + this.source); break; }
        }
    }
    public void volumes(int level){
        if (level > this.volume){
            do {
                this.volume++;
                System.out.print("|");
            } while(level > this.volume);
            this.volume = level;
            System.out.println(this.volume);
        }
        else{
            do {
                this.volume--;
                System.out.print("|");
            } while(level < this.volume);
            this.volume = level;
            System.out.println(this.volume);
        }
    }
}

