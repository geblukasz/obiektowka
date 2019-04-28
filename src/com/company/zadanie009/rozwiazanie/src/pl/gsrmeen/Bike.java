package com.company.zadanie009.rozwiazanie.src.pl.gsrmeen;

public class Bike {
    private BikeColor color;
    private int tireWidth;
    private boolean frameFromAluminum;
    private double price;


    public Bike(BikeColor color, int tireWidth, boolean frameFromAluminum) {
        this.color = color;
        this.tireWidth = tireWidth;
        this.frameFromAluminum = frameFromAluminum;
        this.price = -1;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("(%s, %d, %b) -> %.2f", color.getName(), tireWidth, frameFromAluminum, price);
    }
}
