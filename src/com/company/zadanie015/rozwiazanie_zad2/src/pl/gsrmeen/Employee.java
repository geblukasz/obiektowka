package com.company.zadanie015.rozwiazanie_zad2.src.pl.gsrmeen;

public class Employee {
    private int id;
    private String position;
    private int salary;
    private static int COUNTER = 0;

    public Employee(String position, int salary) {
        this.id = ++COUNTER;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "(" + id + ") (" + position + "): " + salary;
    }

    public int getId() {
        return id;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }
}
