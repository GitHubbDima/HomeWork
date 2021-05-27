package com.step.FindInt;

import java.util.Scanner;

public class FindInt {

    public void showConsonantVowel(char[] takeArray){

        for (int i = 0; i < takeArray.length; i++) {
            switch(takeArray[i]){
                case 65: { System.out.println("this character [" +  takeArray[i] + "] is a vowel.");break; }
                case 69: { System.out.println("this character [" +  takeArray[i] + "] is a vowel.");break; }
                case 73: { System.out.println("this character [" +  takeArray[i] + "] is a vowel.");break; }
                case 79: { System.out.println("this character [" +  takeArray[i] + "] is a vowel.");break; }
                case 85: { System.out.println("this character [" +  takeArray[i] + "] is a vowel.");break; }
                case 97: { System.out.println("this character [" +  takeArray[i] + "] is a vowel.");break; }
                case 101: { System.out.println("this character [" +  takeArray[i] + "] is a vowel.");break; }
                case 105: { System.out.println("this character [" +  takeArray[i] + "] is a vowel.");break; }
                case 111: { System.out.println("this character [" +  takeArray[i] + "] is a vowel.");break; }
                case 117: { System.out.println("this character [" +  takeArray[i] + "] is a vowel.");break; }
            }
            if ( (takeArray[i] > 65 && takeArray[i] < 73) ||
                 (takeArray[i] > 73 && takeArray[i] < 79) ||
                 (takeArray[i] > 79 && takeArray[i] < 85) ||
                 (takeArray[i] > 85 && takeArray[i] < 91) ||
                 (takeArray[i] > 97 && takeArray[i] < 105) ||
                 (takeArray[i] > 105 && takeArray[i] < 111) ||
                 (takeArray[i] > 111 && takeArray[i] < 117) ||
                 (takeArray[i] > 117 && takeArray[i] < 123) ){
                System.out.println("this character [" + takeArray[i] + "] is a consonant.");
            }
        }
    }
}
