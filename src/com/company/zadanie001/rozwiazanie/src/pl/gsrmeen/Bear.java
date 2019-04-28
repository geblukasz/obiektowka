package com.company.zadanie001.rozwiazanie.src.pl.gsrmeen;

public class Bear extends Animal {
    private int furLength;

    public Bear(String name, float weight, int furLength) {
        super(name, weight);
        this.furLength = furLength;
    }

    @Override
    public void introduce() {
        System.out.println("I'm a bear. My name is " + this.name + ". I weigh " + this.weight + " kg and my fur length is " + furLength+ ".");
    }


    public int getFurLength() {
        return furLength;
    }

    public void setFurLength(int furLength) {
        this.furLength = furLength;
    }
}
