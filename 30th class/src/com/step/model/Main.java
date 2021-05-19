package com.step.model;

import com.step.model.accessory.Clock;
import com.step.model.accessory.Headphones;
import com.step.model.appliances.Microwave;
import com.step.model.appliances.Refrigerator;
import com.step.model.appliances.TV;
import com.step.model.appliances.VacuumCleaner;
import com.step.model.bicycle.*;
import com.step.model.differently.Book;
import com.step.model.differently.SafeBox;
import com.step.model.differently.Sofa;
import com.step.model.differently.Wall;
import com.step.model.domestic_animals.Cat;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	// write your code here

        Scanner in = new Scanner(System.in);
/*        Clock clock = new Clock();
        clock.setHour(21);
        clock.showTime();*/

/*        Headphones headphones = new Headphones();
        headphones.cableConnection(false);
        headphones.bluetooth(true);*/

        Microwave microwave = new Microwave();
        microwave.setPower();
        microwave.timer(10);

/*        Refrigerator refrigerator = new Refrigerator();
        refrigerator.doorCheck("close");*/

/*        TV tv = new TV();
        tv.changeSource();
        tv.volumes(100);*/

/*        VacuumCleaner vacuumCleaner = new VacuumCleaner();
        vacuumCleaner.searche_by_price(100);
        vacuumCleaner.searche_by_company("Vitek");*/

/*        SafeBox safeBox = new SafeBox("12345", "yellow");*/

/*        Sofa sofa = new Sofa();
        sofa.setPosition("opened");
        sofa.changePosition();*/

/*        Wall wall = new Wall(4, 2.5);
        System.out.println(wall.perimeter());*/

/*        Book book = new Book();
        book.setAuthor_Title("Robert T.Kiyosaki", "<TATA BOGAT TATA SARAC>");
        System.out.println(book.getTitle_Author());*/

/*        Cat cat = new Cat();
        cat.feedCat("milk");*/

/*        Battery battery = new Battery();
        battery.statusBattery();
        battery.useBattery(3650);
        battery.statusBattery();*/

/*        Motor motor = new Motor();
        do{
            System.out.print(" Insert tension motor: ");
            motor.setTensionMotor(in.nextInt());
        }while(!motor.compareTensionMotor_TensionBattery());*/

/*        Pump pump = new Pump();
        System.out.println(" pump type: " + pump.getPumpType());
        pump.usePump(1000, 2000);*/

/*        Wheel wheel = new Wheel();
        wheel.checkPressure();
        wheel.crossing(11000);
        wheel.checkPressure();*/

/*        Bicycle bicycle = new Bicycle();
        bicycle.*/
    }
}
