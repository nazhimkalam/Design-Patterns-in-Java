package com.designPattern;

import java.util.ArrayList;
import java.util.List;

public class BookShop {

    private String shopName;
    List<Book> books = new ArrayList<>();

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "shopName='" + shopName + '\'' +
                ", books=" + books +
                '}';
    }

    public void loadData()
    {
        for (int i = 1; i <= 10 ; i++)
        {
            Book b = new Book();
            b.setBookID(i);
            b.setBookName("Book" + i);
            getBooks().add(b);
        }
    }

    @Override
    protected BookShop clone() throws CloneNotSupportedException {
        BookShop shop = new BookShop();

        for(Book b: this.getBooks()){
            shop.getBooks().add(b);
        }

        return  shop;
    }
}
