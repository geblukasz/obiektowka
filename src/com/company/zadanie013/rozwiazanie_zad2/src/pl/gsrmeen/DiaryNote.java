package com.company.zadanie013.rozwiazanie_zad2.src.pl.gsrmeen;

public class DiaryNote {
    private String mood;
    private String weather;
    private int hoursPlaying;

    public DiaryNote(String mood, String weather, int hoursPlaying) {
        this.mood = mood;
        this.weather = weather;
        this.hoursPlaying = hoursPlaying;
    }

    public String getMood() {
        return mood;
    }

    public String getWeather() {
        return weather;
    }

    public int getHoursPlaying() {
        return hoursPlaying;
    }
}
