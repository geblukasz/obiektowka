package com.company.zadanie006.rozwiazanie.src.pl.gsrmeen;

import java.util.concurrent.ThreadLocalRandom;

public class RawPowerlifter extends Powerlifter {

    public RawPowerlifter(String firstName, String lastName, int squatStrength, int benchpressStrength, int deadliftStrength) {
        super(firstName, lastName, squatStrength, benchpressStrength, deadliftStrength);
    }

    @Override
    public int getStrengthMax() {
        return 20;
    }

    @Override
    public double getInjuryChance() {
        return 0.05;
    }
}
