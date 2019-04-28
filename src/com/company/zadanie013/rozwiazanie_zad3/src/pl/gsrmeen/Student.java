package com.company.zadanie013.rozwiazanie_zad3.src.pl.gsrmeen;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private int id;
    private Map<String, Integer> grades;

    public Student(int id) {
        this.id = id;
        this.grades = new HashMap<>();
    }

    public void addGrade(String subject, int grade) {
        grades.put(subject, grade);
    }

    public float calculateMean() {
        if(grades.size() == 0)
            return -1;

        float mean = 0;

        for(Map.Entry<String, Integer> entry : grades.entrySet()) {
            mean += entry.getValue();
        }

        return mean / grades.size();
    }

    public int getId() {
        return id;
    }
}
