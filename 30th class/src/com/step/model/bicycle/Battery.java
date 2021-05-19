package com.step.model.bicycle;

public class Battery {
    private static double capacityBattery = 10000;
    private int tensionBattery = 36;

    public void setTensionBattery(int tension) {
        this.tensionBattery = tension;
    }

    public int getTensionBattery() {
        return tensionBattery;
    }

    public void statusBattery(){
            System.out.println("status battery: " + this.capacityBattery / 100 + "%");
    }
    public void useBattery(int timeSeconds){
        this.capacityBattery = this.capacityBattery - timeSeconds;
    }
}
