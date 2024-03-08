package com.object.atm;

import java.util.Scanner;
public class BankMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank(20000);
        System.out.println("enter the option\n 1.withdraw\n 2.deposit\n 3.check balance\n");
        int option = scanner.nextInt();
        switch (option){
            case 1:
                System.out.println("Enter the amount to be withdaw");
                int amount=scanner.nextInt();
                if (amount< bank.balance){
                bank.withdraw(amount);
                double balance = bank.getBalance();
                System.out.println("your balance is " + balance);
            }else if (amount> bank.balance) {
                System.out.println("insufficient balance");
            }else{
                    System.out.println();
            }

            break;
            case 2:
                System.out.println("enter the amount to be deposited");
                int amount1=scanner.nextInt();
                bank.deposit(amount1);
                double balance1= bank.getBalance();
                System.out.println("your balance is "+balance1);
                break;
            case 3:
                double balance2= bank.getBalance();
                System.out.println("your balance is "+balance2);
                break;
            default:
                System.out.println("please enter the correct option");

        }
    }
}
