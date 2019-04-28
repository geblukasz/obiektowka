package com.company.zadanie001.rozwiazanie.src.pl.gsrmeen;

public class Wolf extends Animal implements Canine  {
    private int fangLength;

    public Wolf(String name, float weight, int fangLength) {
        super(name, weight);
        this.fangLength = fangLength;
    }

    @Override
    public void bark() {
        System.out.println("BARK BARK BARK");
    }

    @Override
    public void introduce() {
        System.out.println("I'm a wolf. My name is " + this.name + ". I weigh " + this.weight + " kg and my fang length is " + fangLength + ".");
    }

    public int getFangLength() {
        return fangLength;
    }

    public void setFangLength(int fangLength) {
        this.fangLength = fangLength;
    }
}
