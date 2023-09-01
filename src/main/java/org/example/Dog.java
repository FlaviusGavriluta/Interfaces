package org.example;

public class Dog implements Beings {
    @Override
    public void speaks() {
        System.out.println("Woff woff!");
    }

    @Override
    public void sleeping() {
        System.out.println("Rrrrrr");
    }

    public void sapaGroapa() {
        System.out.println("Dig dig");
    }
}
