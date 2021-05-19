package com.step.ReversArray;

import java.util.Scanner;

public class ReversArray {
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

    public void  showReversArray(){
        for (int i = this.numbers.length - 1; i >= 0; i--) {
            System.out.print(this.numbers[i] + "  ");
        }
    }
}
