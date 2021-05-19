package com.step.model.bicycle;

public class Wheel {
    private final int[] sizeWheel = {14, 16, 18, 20, 22, 24, 26, 28, 30};
    private int pressureWheel = 2000;

    public void crossing(int distanceMeter){
        for (int i = 0; i < distanceMeter; i+=100) {
            this.pressureWheel-=10;
        }
    }

    public void checkPressure(){
        if (this.pressureWheel < 1000){
            System.out.println(" Your wheel is deflated. ");
            Pump pump = new Pump();
            pressureWheel = pump.usePump(pressureWheel, 2000);
        }
        System.out.println(" pressure in wheel = " + this.pressureWheel);
    }
}
