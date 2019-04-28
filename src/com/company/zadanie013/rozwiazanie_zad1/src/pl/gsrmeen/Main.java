package com.company.zadanie013.rozwiazanie_zad1.src.pl.gsrmeen;

public class Main {

    public static void main(String[] args) {
        Traveler traveler = new Traveler("Robert Makłowicz");
        traveler.visitCity("Warsaw");
        traveler.visitCity("New York");
        traveler.visitCity("Brasilia");
        traveler.visitCity("Moscow");
        traveler.visitCity("New York");

        System.out.println(traveler.getName() + " has already been in:");
        for (String city : traveler.getVisitedCities()) {
            System.out.println(city);
        }
    }
}
