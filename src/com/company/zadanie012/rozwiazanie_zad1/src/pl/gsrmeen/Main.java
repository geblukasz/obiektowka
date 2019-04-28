package com.company.zadanie012.rozwiazanie_zad1.src.pl.gsrmeen;

import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Apartment> apartments = new LinkedList<>();
        apartments.add(new Apartment("Warsaw", 65, 12500));
        apartments.add(new Apartment("Cracow", 80, 10250));
        apartments.add(new Apartment("Gdansk", 100, 9000));

        float mean = 0;
        DecimalFormat decFormat = new DecimalFormat("#.00");

        for(int i = 0; i < apartments.size(); i ++) {
            float currentPrice = apartments.get(i).getFullPrice();
            mean += currentPrice;
            System.out.println((i+1) + ". Apartment in " + apartments.get(i).getCity() + " costs " + decFormat.format(currentPrice)+ ".");
        }
        mean /= apartments.size();
        System.out.println("Mean price is " + decFormat.format(mean) + ".");
    }
}
