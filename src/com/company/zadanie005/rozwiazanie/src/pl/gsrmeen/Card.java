package com.company.zadanie005.rozwiazanie.src.pl.gsrmeen;

public class Card {
    private int value;
    private CardColor color;
    private boolean rare;

    public Card(int value, CardColor color, boolean rare) {
        this.value = value;
        this.color = color;
        this.rare = rare;
    }

    @Override
    public String toString() {
        return "(" +
                "" + value +
                ", " + color.getValue() +
                ", " + rare +
                ')';
    }

    public int getValue() {
        return value;
    }

    public CardColor getColor() {
        return color;
    }

    public boolean isRare() {
        return rare;
    }
}
