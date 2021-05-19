package com.step;

import com.step.ArrayMax.ArrayMax;
import com.step.ArraySum.ArraySum;
import com.step.Calculator.Calculator;
import com.step.FindInt.FindInt;
import com.step.ReversArray.ReversArray;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

/*        ArraySum arraySum = new ArraySum();
        arraySum.setNumbers();
        System.out.println(" the sum array is : " + arraySum.sumArray());*/

/*        ReversArray reversArray = new ReversArray();
        reversArray.setNumbers();
        reversArray.showReversArray();*/

/*        ArrayMax arrayMax = new ArrayMax();
        arrayMax.setNumbers();
        System.out.println(" the max value is: " + arrayMax.maxNumberArray());
        System.out.println(" the min value is: " + arrayMax.minNumberArray());*/

/*        FindInt findInt = new FindInt();
        findInt.setChar();
        findInt.showConsonantVowel();*/

        Calculator calculator = new Calculator();
        System.out.println(" 3 + 3 = " + calculator.gathering(3,3));
        System.out.println(" 3.5 + 3.5 = " + calculator.gathering(3.5,3.5));
        System.out.println(" 3 - 3 = " + calculator.decreased(3,3));
        System.out.println(" 3.5 - 3.5 = " + calculator.decreased(3.5,3.5));
        System.out.println(" 3 * 3 = " + calculator.multiplying(3,3));
        System.out.println(" 3.5 * 3.5 = " + calculator.multiplying(3.5,3.5));
        System.out.println(" 3 / 3 = " +  calculator.division(3,3));
        System.out.println(" 3.5 / 3.5 = " + calculator.division(3.5,3.5));

    }
}
