package com.company.zadanie012.rozwiazanie_zad3.src.pl.gsrmeen;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws ParseException {
        List<Book> books = new ArrayList<>();
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");

        books.add(new Book("Data science od podstaw. Analiza danych w Pythonie", "Joel Grus", 296, format.parse("10/11/2018")));
        books.add(new Book("HTML i CSS. Zaprojektuj i zbuduj witrynę WWW.", "Jon Duckett", 512, format.parse("09/12/2017")));
        books.add(new Book("MATEMATYKA ZADANIA MATURALNE I EGZAMINACYJNE", "Tadeusz Korczyc", 214, format.parse("04/22/1994")));

        for(int i = 0; i < books.size(); i++) {
            System.out.println((i+1) + ". book \"" + books.get(i).getTitle() + "\" is " + books.get(i).getDays() + " days old.");
        }
    }
}
