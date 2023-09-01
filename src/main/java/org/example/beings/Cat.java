package org.example.beings;

public class Cat implements Beings {
    @Override
    public void speak() {
        System.out.println("Meaw meaw!");
    }

    @Override
    public void move() {
        System.out.println("The cat runs.");
    }

    @Override
    public void sleeping() {
        System.out.println("Ssssss");
    }
}
