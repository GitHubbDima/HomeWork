package com.step.model.bicycle;

public class Motor extends Battery{
    private int powerMotor;
    private int tensionMotor = 36;

    public void setTensionMotor(int tensionMotor) {
        this.tensionMotor = tensionMotor;
    }

    public boolean compareTensionMotor_TensionBattery(){
        boolean compatible = false;
        if (this.tensionMotor == getTensionBattery()){
            compatible = true;
        }

        if (this.tensionMotor == 36 && compatible){
            this.powerMotor = 350;
            System.out.println(" tension motor with tension battery is compatible.");
            return compatible;
        }
        else if(this.tensionMotor == 48 && compatible){
            this.powerMotor = 450;
            System.out.println(" tension motor with tension battery is compatible.");
            return compatible;
        }
        else{
            System.out.println(" tension motor with tension battery is not compatible, check tension battery. ");
            return compatible;
        }
    }
}
