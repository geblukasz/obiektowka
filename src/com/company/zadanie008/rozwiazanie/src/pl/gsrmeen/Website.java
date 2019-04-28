package com.company.zadanie008.rozwiazanie.src.pl.gsrmeen;

public abstract class Website {
    protected int value;
    protected String name;
    public abstract void obtainMessage(String message);

    public Website(String name) {
        this.name = name;
        value = 0;
    }
}
