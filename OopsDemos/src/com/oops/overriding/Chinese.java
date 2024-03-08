package com.oops.overriding;

public class Chinese extends Menu{
   @Override
    void showItems(String type) {
           super.showItems(type);

        if(type.equals("Starters")){
            System.out.println("Grill");
        } else if (type.equals("Lunch")){
            System.out.println("Biryani");
        } else {
            System.out.println("Desserts");
        }
   }
   void printgames(){
           System.out.println("Cricket");
   }

}
