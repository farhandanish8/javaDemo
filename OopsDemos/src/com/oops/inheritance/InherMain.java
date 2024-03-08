package com.oops.inheritance;

public class InherMain {
    public static void main(String[] args) {
        InEmployee inEmployee = new InEmployee("A",12);
        inEmployee.getDetails();

        InManager inManager = new InManager("B",14,4000);
        inManager.getDetails();
        inManager.printBonus(1000);
    }
}
