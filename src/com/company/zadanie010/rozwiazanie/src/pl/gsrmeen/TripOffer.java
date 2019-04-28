package com.company.zadanie010.rozwiazanie.src.pl.gsrmeen;

import java.util.List;

public class TripOffer {
    private float pricePerNight;
    private int hotelNights;
    private Continent destination;
    private boolean dogsAllowed;


    public TripOffer(float pricePerNight, int hotelNights, Continent destination, boolean dogsAllowed) {
        this.pricePerNight = pricePerNight;
        this.hotelNights = hotelNights;
        this.destination = destination;
        this.dogsAllowed = dogsAllowed;
    }

    public boolean meetsCriteria(float maxPricePerNight, int minHotelNights, List<Continent> continents, boolean dogTravelling) {
        if (dogTravelling && !dogsAllowed)
            return false;

        if (pricePerNight > maxPricePerNight)
            return false;

        if (hotelNights < minHotelNights)
            return false;

        for (Continent c : continents) {
            if(c == destination)
                return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return String.format("(%.2f * %d, %s, %b)", pricePerNight, hotelNights, destination.getAbbreviation(), dogsAllowed);
    }
}
