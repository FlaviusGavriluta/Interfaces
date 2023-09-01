package org.example.ui;

import org.example.beings.*;

import java.util.List;

public class BeingInterface {
    public void run() {

        Dog Rocky = new Dog();
        Human Sam = new Human();
        Cat Lucky = new Cat();
        List<Beings> beings = List.of(Rocky, Sam, Lucky);

        beings.stream().forEach(being -> being.sleeping());

        Zoo.makeThemSpeak(Rocky);
        Zoo.makeThemSpeak(Lucky);
    }
}
