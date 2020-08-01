package com.builder.design.pattern;

public class Builder
{
    // Builder pattern builds a "complex object" using "simple objects" and using a "step by step approach."
    // This type of design pattern comes under "creational" pattern
    // This pattern provides one of the best ways to "create an object"

    private String os;
    private int ram;
    private String processor;
    private double screenSize;
    private int battery;

    public Builder setOs(String os) {
        this.os = os;
        return this;
    }

    public Builder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public Builder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public Builder setScreenSize(double screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public Builder setBattery(int battery) {
        this.battery = battery;
        return this;
    }

    public Phone getPhone()
    {
        return new Phone(os, ram, processor, screenSize, battery);
    }
}
