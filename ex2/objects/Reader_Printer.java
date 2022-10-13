package objects;
import interfaces.Printer;

// package com.solid.book;

public class Reader_Printer implements Printer{
    public void print(Book book) {
        do {
            System.out.println(book.getCurrentPage());
        } while (book.turnToNextPage());
    }
}
