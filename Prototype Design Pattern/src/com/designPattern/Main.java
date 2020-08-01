package com.designPattern;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException{
	    // Prototype pattern refers to creating duplicate object while keeping performance in mind.
        // This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.
        // This pattern involves implementing a prototype interface which tells to create a clone of the current object.

        BookShop bookShop = new BookShop();
        bookShop.setShopName("Harry Potter");
        bookShop.loadData();

        BookShop bookShop1 = bookShop.clone();
        bookShop1.getBooks().remove(2);
        bookShop1.setShopName("Voldamote");

        System.out.println(bookShop);
        System.out.println(bookShop1);

    }
}
