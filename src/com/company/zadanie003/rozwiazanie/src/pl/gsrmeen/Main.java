package com.company.zadanie003.rozwiazanie.src.pl.gsrmeen;
public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant(5);
        HungryCrowd hungryCrowd = new HungryCrowd((dish, timesOrdered) -> restaurant.order(dish, timesOrdered));

        restaurant.startCooking();
        hungryCrowd.startOrdering();
    }



}
