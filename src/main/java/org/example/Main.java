package org.example;

import org.example.ui.BeingInterface;
import org.example.ui.EmagInterface;

public class Main {
    public static void main(String[] args) {
        BeingInterface beingUI = new BeingInterface();
        // beingUI.run();

        EmagInterface emagUI = new EmagInterface();
        emagUI.run();
    }
}