package com.company.zadanie013.rozwiazanie_zad1.src.pl.gsrmeen;


import java.util.LinkedHashSet;
import java.util.Set;

public class Traveler {
    private String name;
    private Set<String> visitedCities;

    public Traveler(String name) {
        this.name = name;
        this.visitedCities = new LinkedHashSet<>();
    }

    public void visitCity(String city) {
        visitedCities.add(city);
    }

    public String getName() {
        return name;
    }

    public Set<String> getVisitedCities() {
        return visitedCities;
    }
}
