package com.company.zadanie011.rozwiazanie.src.pl.gsrmeen;

public class Main {

    public static void main(String[] args) {
        Dealer dealer = new Dealer();


        Car.CarBuilder builderToBuy =
                new Car.CarBuilder("Audi", 3, 2.8)
                .setHasTurbo(true)
                .setHorsePower(220);
        Car carToBuy = builderToBuy.build();

        System.out.println("Car like " + carToBuy + " costs " + dealer.buyCar(builderToBuy));
    }
}
