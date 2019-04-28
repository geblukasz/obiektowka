package com.company.zadanie010.rozwiazanie.src.pl.gsrmeen;

public enum Continent {
    EUROPE("EU"),
    ASIA("AS"),
    AFRICA("AF"),
    SOUTH_AMERICA("SA");

    private String abbreviation;

    Continent(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}
