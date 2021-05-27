package com.step.InitializationArray;

import java.util.Scanner;

public class InitializationArray {

    Scanner in = new Scanner(System.in);

    public void setNumbers(int[] initArray) {
        System.out.println(" Insert values the array: ");
        for (int i = 0; i < initArray.length; i++) {
            System.out.print(" Value " + i + " = " );
            initArray[i] = in.nextInt();
        }
    }

    public void setCharacter(char[] initArray) {
        Scanner in = new Scanner(System.in);

        System.out.println(" Insert the characters: ");
        for (int i = 0; i < initArray.length; i++) {
            System.out.print(" char[" + i + "] = ");
            initArray[i] = in.next().charAt(10);
        }
    }
}
