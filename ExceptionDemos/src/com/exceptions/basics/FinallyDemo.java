package com.exceptions.basics;

public class FinallyDemo {
    public static void main(String[] args) {
        try {
            System.out.println("Welcome");
            String value = "farhan";
            System.out.println("Value " + value);
            int num = Integer.parseInt(value);
            System.out.println("Number " + num);
            int result = 100 / num;
            System.out.println(result);
            int marks[] = null;
            System.out.println(marks[0]);
        }catch (ArrayIndexOutOfBoundsException | NullPointerException | NumberFormatException | ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println("Please enter value");
            System.out.println("Please enter a number");
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }catch(Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }finally {
            System.out.println("close the connection");
        }
        System.out.println("completed");
    }
}