package com.step;

import com.step.Exceptions.IntExceptions.IntExceptions;

import java.util.Scanner;

public class App {

   Scanner in = new Scanner(System.in);

   public void verifyIf_IsInt()throws IntExceptions {
        System.out.println("Enter a number: ");
        int number;
        try {
            number = in.nextInt();
        } catch (Exception ex) {
            throw new IntExceptions("Wrong input");
        }
    }


}
