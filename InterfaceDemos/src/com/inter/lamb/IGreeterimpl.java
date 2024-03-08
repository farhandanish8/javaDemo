package com.inter.lamb;

public class IGreeterimpl implements IGreeter{
    @Override
    public void greetMessage(String message) {
        System.out.println("Hello,how are you?");
    }
}
