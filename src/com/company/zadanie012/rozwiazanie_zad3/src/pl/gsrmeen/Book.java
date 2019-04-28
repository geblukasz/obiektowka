package com.company.zadanie012.rozwiazanie_zad3.src.pl.gsrmeen;

import java.util.Date;

public class Book {
    private String title;
    private String author;
    private int pages;
    private Date printed;

    public Book(String title, String author, int pages, Date printed) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.printed = printed;
    }

    public long getDays() {
        return((new Date().getTime() -  printed.getTime()) / (1000 * 60 * 60 * 24));
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public Date getPrinted() {
        return printed;
    }
}
