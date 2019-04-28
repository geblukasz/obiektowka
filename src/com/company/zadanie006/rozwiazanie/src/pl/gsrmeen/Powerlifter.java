package com.company.zadanie006.rozwiazanie.src.pl.gsrmeen;

import java.util.concurrent.ThreadLocalRandom;

public abstract class Powerlifter {
    protected String firstName;
    protected String lastName;
    protected int squatStrength;
    protected int benchpressStrength;
    protected int deadliftStrength;

    public void train(int trainingLength) {
        for (int i = 0; i < trainingLength; i++) {
            int min = Math.min(squatStrength, Math.min(benchpressStrength, deadliftStrength));

            if(min == getStrengthMax()) {
                System.out.println(this.toString() + " cannot train anymore.");
                break;
            }


            int randomValue = ThreadLocalRandom.current().nextInt(0, 100 + 1);
            int injuryBound = (int)(getInjuryChance() * 100);
            if(randomValue <= injuryBound) {
                System.out.println(this.toString() + " sustained an injury and cannot train now.");
                break;
            }


            if(min == squatStrength) {
                squatStrength++;
                System.out.println(this.toString() + " trained squat.");
            } else if (min == benchpressStrength) {
                benchpressStrength++;
                System.out.println(this.toString() + " trained bench press.");
            } else {
                deadliftStrength++;
                System.out.println(this.toString() + " trained deadlift.");
            }
        }
    }

    public abstract int getStrengthMax();
    public abstract double getInjuryChance();


    public Powerlifter(String firstName, String lastName, int squatStrength, int benchpressStrength, int deadliftStrength) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.squatStrength = squatStrength;
        this.benchpressStrength = benchpressStrength;
        this.deadliftStrength = deadliftStrength;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSquatStrength() {
        return squatStrength;
    }

    public int getBenchpressStrength() {
        return benchpressStrength;
    }

    public int getDeadliftStrength() {
        return deadliftStrength;
    }

    public void setSquatStrength(int squatStrength) {
        this.squatStrength = squatStrength;
    }

    public void setBenchpressStrength(int benchpressStrength) {
        this.benchpressStrength = benchpressStrength;
    }

    public void setDeadliftStrength(int deadliftStrength) {
        this.deadliftStrength = deadliftStrength;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName +
                " SQ: " + squatStrength +
                " BP: " + benchpressStrength +
                " DL: " + deadliftStrength;
    }
}
