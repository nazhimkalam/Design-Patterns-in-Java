package com.designPattern;

import java.util.ArrayList;
import java.util.List;

// we refer Composite tools as:- Peripheral devices, Cabinet, MotherBoard, Computer
// we refer Component/Leaf as:- Hard Disk, Mouse, Monitor, Ram, CPU


// Component interface
interface Component {
    void showPrice();
}

// Leaf class
class Leaf implements Component {
    String name;
    int price;

    public Leaf(String name, int price) {   // Constructor
        this.name = name;
        this.price = price;
    }

    @Override
    public void showPrice() {
        System.out.println(name + " : " + price);
    }
}

// Composite class
class Composite implements Component {
    String name;

    public Composite(String name) {   // Constructor
        this.name = name;
    }

    List<Component> components = new ArrayList<>();

    public void addComponent(Component comp){
        components.add(comp);
    }

    @Override
    public void showPrice() {
        System.out.println(name);

        for(Component c : components)
        {
            c.showPrice();
        }

    }
}
