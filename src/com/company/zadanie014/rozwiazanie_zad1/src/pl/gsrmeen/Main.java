package com.company.zadanie014.rozwiazanie_zad1.src.pl.gsrmeen;

public class Main {

    public static void main(String[] args) {
        Class c = new Class();
        c.addStudent("Jacek");
        c.addStudent("Ania");
        c.addStudent("Marek");
        c.addStudent("Grzesiek");
        c.addStudent("Kasia");

        c.displayStudents();

        System.out.println("This class has " + c.getGirlsCount() + " girls.");
    }
}
