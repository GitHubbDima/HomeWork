package com.step.model.appliances;

public class VacuumCleaner {
    private String[] company = {"Vitek", "Bosch", "Vitek", "Panasonic"};
    private int[] price = {1000, 1200, 1400, 1000};

    public void searche_by_price(int price) {
        boolean check = true;
        System.out.print(price + ": ");

        for (int i = 0; i < this.price.length; i++) {
            if (price == this.price[i]) {
                System.out.print(this.company[i] + ", ");
                check = false;
            }
        }

        if(check){
            System.out.println("nothing was found a this price");
        }
        else{
            System.out.println();
        }
    }

    public void searche_by_company(String company){
        boolean check = true;
        System.out.print(company + ": ");

        for (int i = 0; i < this.company.length; i++) {
            if ( this.company[i].equals(company)){
                System.out.print(this.price[i] + ", ");
                check = false;
            }
        }

        if(check){
            System.out.println("nothing was found with this name");
        }
        else{
            System.out.println();
        }
    }
}
