package com.company.zadanie009.rozwiazanie.src.pl.gsrmeen;

public enum BikeColor {
    Red("RED"),
    Green("GREEN"),
    Blue("BLUE");

    private String name;

    BikeColor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
