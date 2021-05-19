package com.step.ArrayMax;

import java.util.Scanner;

public class ArrayMax {
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

    public int maxNumberArray(){
        int maxNumber = this.numbers[0];

        for (int i = 1; i < this.numbers.length; i++) {
            if (maxNumber < this.numbers[i]){
                maxNumber = this.numbers[i];
            }
        }
        return maxNumber;
    }

    public int minNumberArray(){
        int minNumber = this.numbers[0];

        for (int i = 1; i < this.numbers.length; i++) {
            if (minNumber > this.numbers[i]){
                minNumber = this.numbers[i];
            }
        }
        return minNumber;
    }
}
