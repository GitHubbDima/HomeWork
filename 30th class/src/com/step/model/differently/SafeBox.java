package com.step.model.differently;

public class SafeBox {
    private final String digitalPassword = "123456";
    private final String colorPassword = "yellow";

    public SafeBox(String digitalPassword, String colorPassword){
        if(digitalPassword == this.digitalPassword && colorPassword == this.colorPassword){
            System.out.println(" it's OK, the door is open ");
        }
        else{
            this.callSecurity();
        }
    }

    public void callSecurity(){
        System.out.println("ALARM!!! Call Bercut Security successful dialing");
    }
}
