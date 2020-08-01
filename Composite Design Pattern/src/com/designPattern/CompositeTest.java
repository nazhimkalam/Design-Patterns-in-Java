package com.designPattern;

// Composite pattern is used where we need to treat a group of objects in similar way as a single object.
// Composite pattern composes objects in term of a tree structure to represent part as well as whole hierarchy.
// This type of design pattern comes under structural pattern as this pattern creates a tree structure of group of objects.

public class CompositeTest {
    public static void main(String[] args) {
        Component hdd = new Leaf("HDD", 9500);
        Component mouse = new Leaf("Mouse", 1500);
        Component monitor = new Leaf("Monitor", 7500);
        Component ram = new Leaf("Ram", 8000);
        Component cpu = new Leaf("CPU", 5500);

        Composite peripheral = new Composite("Peripheral");
        Composite cabinet = new Composite("Cabinet");
        Composite motherBoard = new Composite("Mother-Board");
        Composite computer = new Composite("Computer");


        motherBoard.addComponent(ram);
        motherBoard.addComponent(cpu);

        peripheral.addComponent(mouse);
        peripheral.addComponent(monitor);
        cabinet.addComponent(hdd);
        cabinet.addComponent(motherBoard);

        computer.addComponent(peripheral);
        computer.addComponent(cabinet);

//        computer.showPrice();
//        cabinet.showPrice();
//        peripheral.showPrice();
//        ram.showPrice();

    }
}
