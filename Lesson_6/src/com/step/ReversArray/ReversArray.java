package com.step.ReversArray;

import java.util.Scanner;

public class ReversArray {

    public void  showReversArray(int[] takeArray){
        for (int i = takeArray.length - 1; i >= 0; i--) {
            System.out.print(takeArray[i] + "  ");
        }
    }
}
