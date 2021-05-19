package com.step.ArraySum;

import java.util.Scanner;

public class ArraySum{
    private int[] numbers;

    public void setNumbers() {
        Scanner in = new Scanner(System.in);

        System.out.print(" Insert length the array: ");
        this.numbers = new int[in.nextInt()];

        System.out.println(" Insert values the array: ");
        for (int i = 0; i < this.numbers.length; i++) {
            System.out.print(" Value " + i + " = " );
            this.numbers[i] = in.nextInt();
        }
    }

    public int sumArray(){
        int sumArray = this.numbers[0];
        for (int i = 1; i < this.numbers.length; i++) {
            sumArray += this.numbers[i];
        }
        return sumArray;
    }
}
