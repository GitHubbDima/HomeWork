package com.step.ArraySum;

import java.util.Scanner;

public class ArraySum{

    public int calculateSumArray(int[] takeArray){
        int sumArray = takeArray[0];
        for (int i = 1; i < takeArray.length; i++) {
            sumArray += takeArray[i];
        }
        return sumArray;
    }
}
