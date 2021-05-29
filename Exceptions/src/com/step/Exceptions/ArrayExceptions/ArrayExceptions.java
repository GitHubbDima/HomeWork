package com.step.Exceptions.ArrayExceptions;

public class ArrayExceptions extends ArrayIndexOutOfBoundsException{
    private String message;
    public ArrayExceptions(String mess){
        this.message = mess;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
