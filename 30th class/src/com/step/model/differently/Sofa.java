package com.step.model.differently;

public class Sofa {
    private String position;
    private double length;

    public void setPosition(String position) {
        this.position = position;
    }

    public void changePosition(){
        if(this.position == "opened"){
            this.length = 1.90;
            System.out.println("length sofa when it's opened is: " + this.length + "m.");
        }
        else{
            this.length = 1.20;
            System.out.println("length sofa when it's closely is: " + this.length + "m.");
        }
    }
}
