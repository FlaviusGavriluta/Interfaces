package org.example.beings;


public class Human implements Beings {
    @Override
    public void speak() {
        System.out.println("Hey hey!");
    }

    @Override
    public void sleeping() {
        System.out.println("Zzzzzz");
    }

    @Override
    public void move() {
        System.out.println("The human walks.");
    }
}