package com.company.zadanie013.rozwiazanie_zad3.src.pl.gsrmeen;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
	    Student student = new Student(150);

        student.addGrade("Maths", 4);
        student.addGrade("English", 3);
        student.addGrade("PE", 6);
        student.addGrade("Biology", 5);

        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Student's id: " + student.getId());
        System.out.println("Student's mean: " + df.format(student.calculateMean()));

    }
}
