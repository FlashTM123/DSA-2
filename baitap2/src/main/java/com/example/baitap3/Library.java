package com.example.baitap3;

public class Library {
    private Book[] books;
    private int bookCount;
    private static final int MAX_BOOKS = 100;

    public Library() {
        books = new Book[MAX_BOOKS];
        bookCount = 0;
    }

    public void addBook(Book book){
        if(bookCount < MAX_BOOKS) {
            books[bookCount++] = book;
        } else {
            System.out.println("Library is full, cannot add more books.");
        }
    }
    public void findBook(String keyword){
        boolean found = false;
        for (int i = 0; i < bookCount; i++) {
            Book book = books[i];
            if (book.getTitle().equalsIgnoreCase(keyword) || book.getAuthor().equalsIgnoreCase(keyword)) {
                book.displayInfo();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No book found with the given keyword.");
        }
    }
    public void displayAllBooks(){
        for (int i = 0; i < bookCount; i++) {
            books[i].displayInfo();
        }
    }
}
