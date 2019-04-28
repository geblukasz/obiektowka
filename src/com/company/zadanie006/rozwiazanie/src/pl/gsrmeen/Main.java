package com.company.zadanie006.rozwiazanie.src.pl.gsrmeen;

public class Main {

    public static void main(String[] args) {
        Powerlifter[] powerlifters = new Powerlifter[2];

        powerlifters[0] = new RawPowerlifter("Robert", "Piotrkowicz", 15, 18, 12);
        powerlifters[0].train(6);

        System.out.println();

        powerlifters[1] = new EquippedPowerlifter("Blaine", "Summer", 39, 45, 40);
        powerlifters[1].train(6);
    }
}
