package com.step;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public boolean checkIf_IsInteger(String needNumber){
        try {
            Integer.parseInt(needNumber);
            return false;
        } catch (Exception exceptionc) {
            System.out.println("Wrong input");
            return true;
        }
    }
}
