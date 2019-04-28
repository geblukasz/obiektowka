package com.company.zadanie009.rozwiazanie.src.pl.gsrmeen;

public class BikeRental {
    private double income;

    public BikeRental() {
        this.income = 0;
    }

    public Bike orderBike(BikeColor color, int tireWidth, boolean frameFromAluminum, int days) {
        Bike rc = new Bike(color, tireWidth, frameFromAluminum);
        double price = 0;

        switch (color) {
            case Red:
                price += 500;
                break;
            case Blue:
                price += 250;
                break;
            case Green:
                price += 100;
                break;
        }

        price += ((double)tireWidth/3);

        if(frameFromAluminum)
            price *= 2;

        price /= 20;
        price *= days;

        this.income += price;
        rc.setPrice(price);

        return rc;
    }

    public double getIncome() {
        return income;
    }
}
