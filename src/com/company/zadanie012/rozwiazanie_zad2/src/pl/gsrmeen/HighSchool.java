package com.company.zadanie012.rozwiazanie_zad2.src.pl.gsrmeen;

public class HighSchool {
    private String name;
    private int threshold;
    private int distance;

    public HighSchool(String name, int threshold, int distance) {
        this.name = name;
        this.threshold = threshold;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public int getThreshold() {
        return threshold;
    }

    public int getDistance() {
        return distance;
    }
}
