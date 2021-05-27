package com.step.ArrayMax;

import com.step.InitializationArray.InitializationArray;

import java.util.Scanner;

public class ArrayMax {

    public int findMaxNumberArray(int[] numbers){
        int maxNumber = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (maxNumber < numbers[i]){
                maxNumber = numbers[i];
            }
        }
        return maxNumber;
    }

    public int findMinNumberArray(int[] numbers){
        int minNumber = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (minNumber > numbers[i]){
                minNumber = numbers[i];
            }
        }
        return minNumber;
    }
}
