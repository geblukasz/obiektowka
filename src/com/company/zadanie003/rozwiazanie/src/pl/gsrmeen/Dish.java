package com.company.zadanie003.rozwiazanie.src.pl.gsrmeen;

public enum Dish {
    IceCream(8),
    Gyros(12),
    Tortilla(13),
    Pizza(18),
    Steak(30);

    private int price;

    Dish(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
