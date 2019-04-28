package com.company.zadanie006.rozwiazanie.src.pl.gsrmeen;

public class EquippedPowerlifter extends Powerlifter {

    public EquippedPowerlifter(String firstName, String lastName, int squatStrength, int benchpressStrength, int deadliftStrength) {
        super(firstName, lastName, squatStrength, benchpressStrength, deadliftStrength);
    }

    @Override
    public int getStrengthMax() {
        return 45;
    }

    @Override
    public double getInjuryChance() {
        return 0.15;
    }

}
