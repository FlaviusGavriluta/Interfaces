package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Dog Rocky = new Dog();
        Human Sam = new Human();
        Cat Lucky = new Cat();

        List<Beings> beings = List.of(Rocky, Sam, Lucky);

        beings.stream().forEach(being -> being.sleeping());
    }
}