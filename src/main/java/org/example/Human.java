package org.example;


public class Human implements Beings {
    @Override
    public void speaks() {
        System.out.println("Hey hey!");
    }

    @Override
    public void sleeping() {
        System.out.println("Zzzzzz");
    }
}