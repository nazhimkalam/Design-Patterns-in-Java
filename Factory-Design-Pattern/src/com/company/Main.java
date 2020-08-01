package com.company;

import com.phone.OS;
import com.phone.OperatingSystemFactory;

public class Main
{
    // Working with Factory Design Pattern
    public static void main(String[] args) {

        // The factory method pattern is a creational pattern that uses factory methods to deal with the problem of
        // creating objects without having to specify the exact class of the object that will be created.


        OperatingSystemFactory osf = new OperatingSystemFactory();   // this is using the factory method to access the objects
        OS obj = osf.getInstance("Android");
        obj.spec();
    }
}
