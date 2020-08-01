package com.builder.design.pattern;

public class Shop {
    public static void main(String[] args) {
        Phone phone = new Builder().setOs("Android").setRam(2).setBattery(3000).getPhone();
        System.out.println(phone);
    }
}
