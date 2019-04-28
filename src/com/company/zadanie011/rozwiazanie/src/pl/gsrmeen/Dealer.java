package com.company.zadanie011.rozwiazanie.src.pl.gsrmeen;

public class Dealer {


    private String manufacturer;
    private int age;
    private double engineCapacity;

    // optional
    private String model;
    private String color;
    private int horsePower;
    private boolean hasTurbo;



    public double buyCar(Car.CarBuilder builder) {
        return calculateCarPrice(builder.build());
    }


    public double sellCar(Car c) {
        double price = calculateCarPrice(c);
        return price * 0.8;
    }


    private double calculateCarPrice(Car c) {
        double result = 0;
        result += c.getManufacturer().length() * 250; // 750-2.5k
        result -= c.getAge() * 100; // 0-2k
        result += c.getEngineCapacity() * 2500; // 2.5k-12.5k

        if (!c.getModel().equals(Car.UNKNOWN))
            result += c.getModel().endsWith("R") ? 10000 : 0;

        if (!c.getColor().equals(Car.UNKNOWN))
            result += c.getColor().toLowerCase().equals("red") ? 7500 : 0;

        if (c.getHorsePower() != -1)
            result += c.getHorsePower() * 10;

        result += c.hasTurbo()? 10000 : 0;

        return result;
    }
}
