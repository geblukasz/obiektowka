package com.company.zadanie012.rozwiazanie_zad1.src.pl.gsrmeen;

public class Apartment {
    private String city;
    private int surface;
    private int pricePerMeter;

    public Apartment(String city, int surface, int pricePerMeter) {
        this.city = city;
        this.surface = surface;
        this.pricePerMeter = pricePerMeter;
    }

    public float getFullPrice() {
        return surface * pricePerMeter * 0.95f;
    }

    public String getCity() {
        return city;
    }
}
