package com.company.zadanie009.rozwiazanie.src.pl.gsrmeen;

public class Main {

    public static void main(String[] args) {
	    BikeRental bikeRental = new BikeRental();

        Bike bike2 = bikeRental.orderBike(BikeColor.Red, 25, true, 15);
        System.out.println("Ordered for 15 days: "  + bike2.toString());

	    Bike bike1 = bikeRental.orderBike(BikeColor.Green, 85, false, 40);
        System.out.println("Ordered for 40 days: " + bike1.toString());

        Bike bike3 = bikeRental.orderBike(BikeColor.Blue, 43, true, 20);
        System.out.println("Ordered for 20 days: " + bike3.toString());

        System.out.println(String.format("Rental income: %.2f", bikeRental.getIncome()));
    }
}
