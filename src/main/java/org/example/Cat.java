package org.example;

public class Cat implements Beings {
    @Override
    public void speaks() {
        System.out.println("Meaw meaw!");
    }

    @Override
    public void sleeping() {
        System.out.println("Ssssss");
    }
}
