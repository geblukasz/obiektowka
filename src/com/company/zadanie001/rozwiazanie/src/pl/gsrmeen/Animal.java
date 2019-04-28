package com.company.zadanie001.rozwiazanie.src.pl.gsrmeen;

public abstract class Animal {
    private int id;
    protected String name;
    protected float weight;
    private static int COUNTER = 0;

    public Animal(String name, float weight) {
        this.id = ++COUNTER;
        this.name = name;
        this.weight = weight;
    }

    public abstract void introduce();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
