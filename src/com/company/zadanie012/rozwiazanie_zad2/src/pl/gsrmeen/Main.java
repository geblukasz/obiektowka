package com.company.zadanie012.rozwiazanie_zad2.src.pl.gsrmeen;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<HighSchool> highSchools = new ArrayList<>();
        highSchools.add(new HighSchool("LO im. Jana Zamoyskiego", 173, 15));
        highSchools.add(new HighSchool("LO im. Mikołaja Kopernika", 193, 7));
        highSchools.add(new HighSchool("LO im. Batalionu \"Zośka\"", 122, 6));

        HighSchool acceptedSchool = null;

        for (HighSchool school : highSchools) {

            System.out.println(school.getName() + " needs " + school.getThreshold() + " pts and is " + school.getDistance() + " km away.");

            if (180 > school.getThreshold() && school.getDistance() < 10) {
                if (acceptedSchool == null) {
                    acceptedSchool = school;
                } else {
                    if (school.getThreshold() > acceptedSchool.getThreshold()) {
                        acceptedSchool = school;
                    }
                }
            }
        }

        if(acceptedSchool == null) {
            System.out.println("There is no high school that meets the requirements.");
        } else {
            System.out.println("Apply for " + acceptedSchool.getName() + ".");
        }


    }
}
