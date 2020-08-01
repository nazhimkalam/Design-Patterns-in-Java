package com.designPattern;

// THIS IS THE MAIN JAVA CLASS

// Adapter pattern works as a bridge between two incompatible interfaces.
// This type of design pattern comes under structural pattern as this pattern combines the capability of two independent interfaces.

public class School {
    public static void main(String[] args) {

        Pen p = new PenAdapter();

        AssignmentWork aw = new AssignmentWork();

        aw.setP(p);

        aw.writeAssignment("I am writing the Assignment...");

    }
}

