package com.step.FindInt;

import java.util.Scanner;

public class FindInt {
    private char[] character = new char[10];

    public void setChar() {
        Scanner in = new Scanner(System.in);

        System.out.println(" Insert the character: ");
        //String forChar = in.next();
        //character = forChar.toCharArray();

        for (int i = 0; i < character.length; i++) {
            System.out.print(" char[" + i + "] = ");
            character[i] = in.next().charAt(10);
           // System.out.println(" char " + i + " = " + character[i]);
        }
    }

    public void showConsonantVowel(){

        for (int i = 0; i < this.character.length; i++) {
            switch(this.character[i]){
                case 65: { System.out.println("this character [" +  this.character[i] + "] is a vowel.");break; }
                case 69: { System.out.println("this character [" +  this.character[i] + "] is a vowel.");break; }
                case 73: { System.out.println("this character [" +  this.character[i] + "] is a vowel.");break; }
                case 79: { System.out.println("this character [" +  this.character[i] + "] is a vowel.");break; }
                case 85: { System.out.println("this character [" +  this.character[i] + "] is a vowel.");break; }
                case 97: { System.out.println("this character [" +  this.character[i] + "] is a vowel.");break; }
                case 101: { System.out.println("this character [" +  this.character[i] + "] is a vowel.");break; }
                case 105: { System.out.println("this character [" +  this.character[i] + "] is a vowel.");break; }
                case 111: { System.out.println("this character [" +  this.character[i] + "] is a vowel.");break; }
                case 117: { System.out.println("this character [" +  this.character[i] + "] is a vowel.");break; }
            }
            if ( (this.character[i] > 65 && this.character[i] < 73) ||
                 (this.character[i] > 73 && this.character[i] < 79) ||
                 (this.character[i] > 79 && this.character[i] < 85) ||
                 (this.character[i] > 85 && this.character[i] < 91) ||
                 (this.character[i] > 97 && this.character[i] < 105) ||
                 (this.character[i] > 105 && this.character[i] < 111) ||
                 (this.character[i] > 111 && this.character[i] < 117) ||
                 (this.character[i] > 117 && this.character[i] < 123) ){
                System.out.println("this character [" + this.character[i] + "] is a consonant.");
            }
        }
    }
}
