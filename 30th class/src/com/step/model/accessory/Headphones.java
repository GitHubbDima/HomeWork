package com.step.model.accessory;

public class Headphones {
    private String voice_message;
    private static boolean connecting = false;

    public void cableConnection(boolean connecting){
        this.connecting = connecting;
        if (connecting){
            voice_message = "cable connection";
            System.out.println(voice_message);
        }
        else{
            voice_message = "disconnected";
            System.out.println(voice_message);
        }
    }

    public void bluetooth(boolean connecting){
        this.connecting = connecting;
        if (connecting){
            voice_message = "bluetooth connection";
            System.out.println(voice_message);
        }
        else{
            voice_message = "disconnected";
            System.out.println(voice_message);
        }
    }
}
