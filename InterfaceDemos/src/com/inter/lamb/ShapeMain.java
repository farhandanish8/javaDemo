package com.inter.lamb;

public class ShapeMain {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        IShape shape = new Rectangle();
        factory.printArea(shape, 10, 20);

      //  factory.printArea(int x,int y)->{
        System.out.println("Calculating sq area");
    //},10,20);
    };
}