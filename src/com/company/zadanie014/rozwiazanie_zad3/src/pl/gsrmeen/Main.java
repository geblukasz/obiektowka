package com.company.zadanie014.rozwiazanie_zad3.src.pl.gsrmeen;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Alcohol> alcohols = new ArrayList<>();
        alcohols.add(new Alcohol("Beer", 0.05f));
        alcohols.add(new Alcohol("Vodka", 0.4f));
        alcohols.add(new Alcohol("Wine", 0.14f));
        alcohols.add(new Alcohol("Hooch", 0.7f));

        int weight = 80;
        int quantity = 100;

        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        df.setMinimumFractionDigits(2);

        for(Alcohol alcohol : alcohols) {
            float permils = alcohol.calculatePerMil(quantity, weight, true);
            System.out.println("Man (" + weight +"kg) will have " + df.format(permils) +"‰ blood-alcohol content " +
                    "after drinking " + quantity + "ml of " + alcohol.getName() + ".");
        }

    }
}
