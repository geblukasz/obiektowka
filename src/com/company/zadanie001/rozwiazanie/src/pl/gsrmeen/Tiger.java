package com.company.zadanie001.rozwiazanie.src.pl.gsrmeen;

public class Tiger extends  Animal {
    private int clawLength;

    public Tiger(String name, float weight, int clawLength) {
        super(name, weight);
        this.clawLength = clawLength;
    }

    @Override
    public void introduce() {
        System.out.println("I'm a tiger. My name is " + this.name + ". I weigh " + this.weight + " kg and my claw length is " + clawLength+ ".");
    }

    public int getClawLength() {
        return clawLength;
    }

    public void setClawLength(int clawLength) {
        this.clawLength = clawLength;
    }
}
