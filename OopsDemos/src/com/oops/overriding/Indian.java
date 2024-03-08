package com.oops.overriding;

public class Indian extends Menu{
    @Override
    void showItems(String type) {
        super.showItems(type);
        if(type.equals("Breakfast")){
            System.out.println("Vadapav");
       } else if (type.equals("Lunch")) {
            System.out.println("DalRice");
        } else {
            System.out.println("Desserts");
        }
    }
}
