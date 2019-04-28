package com.company.zadanie005.rozwiazanie.src.pl.gsrmeen;


public enum CardColor {
    Clubs(1),       //trefl
    Diamonds(2),    //karo
    Hearts(3),      //kier
    Spades(4);      //pik

    private int value;

    CardColor(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
