package com.example.baitap3;

public class FictionBook extends Book {
    private String genre;
    public String getGenre() {
        return genre;
    }


    public void setGenre(String genre) {
        this.genre = genre;
    }


    public FictionBook(String title, String author, String genre) {
        super(title, author);
        this.genre = genre;
    }


    @Override
    public void displayInfo() {
        System.out.println("Title: " + super.getTitle() + ", Author: " + super.getAuthor() + ", Genre: " + this.getGenre());
    }
   
}
