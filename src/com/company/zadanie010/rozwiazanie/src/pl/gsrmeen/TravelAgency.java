package com.company.zadanie010.rozwiazanie.src.pl.gsrmeen;

import java.util.ArrayList;
import java.util.List;

public class TravelAgency {
    private List<TripOffer> offers;

    public TravelAgency() {
        this.offers = new ArrayList<>();
    }

    public boolean bookOffer(float maxPricePerNight, int minHotelNights, List<Continent> continents, boolean dogTravelling) {
        for (int i = 0; i < offers.size(); i++) {
            if (offers.get(i).meetsCriteria(maxPricePerNight, minHotelNights, continents, dogTravelling)) {
                offers.remove(i);
                return true;
            }
        }
        return false;
    }

    public void displayOffers() {
        for (TripOffer offer : offers) {
            System.out.print(offer.toString() + " ");
        }
        System.out.println();
    }

    public List<TripOffer> getOffers() {
        return offers;
    }
}
