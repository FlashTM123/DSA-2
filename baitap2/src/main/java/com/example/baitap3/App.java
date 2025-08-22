package com.example.baitap3;

public class App {
    public static void main(String[] args) {
        Library lb = new Library();
        Book bl = new FictionBook("The Great Gatsby", "F. Scott Fitzgerald", "Novel");
        Book bl2 = new NonFictionBook("Sapiens", "Yuval Noah Harari", "History");
        lb.addBook(bl);
        lb.addBook(bl2);
        lb.displayAllBooks();
    }
}
