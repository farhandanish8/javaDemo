package com.inter.lamb;

public class ShapeDemo {
    public static void main(String[] args) {
        IShape iShape = new IShape() {
            @Override
            public void area(int x, int y) {
                System.out.println(x*y);
            }
        };
        iShape.area(10,20);
    }
}
