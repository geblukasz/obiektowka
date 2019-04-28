package com.company.zadanie013.rozwiazanie_zad2.src.pl.gsrmeen;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Integer, DiaryNote> diary = new HashMap<>();

        diary.put(3, new DiaryNote("happy", "cloudy", 4));
        diary.put(6, new DiaryNote("cranky", "rainy", 2));
        diary.put(7, new DiaryNote("annoyed", "sunny", 1));
        diary.put(10, new DiaryNote("joyful", "cloudy", 5));

        for (Map.Entry<Integer, DiaryNote> entry : diary.entrySet())
        {
            System.out.println(entry.getKey()+ " : I was " + entry.getValue().getMood() + ", because I played for " +
                    entry.getValue().getHoursPlaying() + "h and it was " + entry.getValue().getWeather() + ".");
        }
    }
}
