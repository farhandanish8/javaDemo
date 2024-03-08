package com.inter.lamb;

public class MenuLamba {
    public static void main(String[] args) {

        IMenu iMenu = () -> System.out.println("Chinese : Noodles");
        IMenu iMenu1 = () -> System.out.println("Indian : Biryani");
        IMenu iMenu2 = () -> System.out.println("Italian : Sushi");

        iMenu.showMenu();
        iMenu1.showMenu();
        iMenu2.showMenu();
    }
}
