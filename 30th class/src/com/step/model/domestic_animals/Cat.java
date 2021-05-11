package com.step.model.domestic_animals;

public class Cat {
    private  String sayMiau;
    private static String[] hungry = {"milk", "sausage", "meat", "fish"};

    public void feedCat(String food){
        for (int i = 0; i < this.hungry.length; i++) {
            if (this.hungry[i] == food){
                this.sayMiau = this.catSay(true);
                break;
            }
            else {
                this.sayMiau = this.catSay(false);
                break;
            }
        }
        System.out.println(this.sayMiau);
    }
    private String catSay(boolean coincidence){
        if (coincidence){
            return "I Like this, MiauMiauMiauMiauMiauMiau";
        }
        else{
            return "it's not tasty, Mmmmmmm";
        }
    }
}
