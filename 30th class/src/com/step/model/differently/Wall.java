package com.step.model.differently;

public class Wall {
    private double lenght;
    private double width;

    public Wall(double lenght, double width){
        this.lenght = lenght;
        this.width = width;
    }

    public double perimeter(){
        return 2*(this.width + this.lenght);
    }
}
