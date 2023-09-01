package org.example.beings;

public class Dog implements Beings {
    @Override
    public void speak() {
        System.out.println("Woff woff!");
    }

    @Override
    public void sleeping() {
        System.out.println("Rrrrrr");
    }

    @Override
    public void move() {
        System.out.println("The dog runs.");
    }

    public void sapaGroapa() {
        System.out.println("Dig dig");
    }
}
