package com.example.baitap3;

public class NonFictionBook extends Book {
    private String subject;
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public NonFictionBook(String title, String author, String subject) {
        super(title, author);
        this.subject = subject;
    }

    @Override
    public void displayInfo() {
        System.out.println("Title: " + super.getTitle() + ", Author: " + super.getAuthor() + ", Subject: " + this.getSubject());
    }

       
        
    }



