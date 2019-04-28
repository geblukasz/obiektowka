package com.company.zadanie015.rozwiazanie_zad2.src.pl.gsrmeen;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Programmer", 12000));
        employees.add(new Employee("Secretary", 6500));
        employees.add(new Employee("Programmer", 13500));
        employees.add(new Employee("Programmer", 6000));
        employees.add(new Employee("Programmer", 8000));

        displayEmployees(employees);
        displayAnnualMean(employees);
        displayRichEmployees(employees);
    }

    private static void displayRichEmployees(List<Employee> employees) {
        List<Integer> richIds = new ArrayList<>();
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getSalary() > 7000) {
                richIds.add(employees.get(i).getId());
            }
        }
        System.out.print("Employees who earn more than 7k: ");
        for (int i = 0; i < richIds.size(); i++) {
            System.out.print(richIds.get(i));
            if (i < richIds.size() - 1)
                System.out.print(", ");
            else
                System.out.println(".");
        }
    }

    private static void displayEmployees(List<Employee> employees) {
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    private static void displayAnnualMean(List<Employee> employees) {
        float mean = 0;
        int programmersCount = 0;
        for (Employee e : employees) {
            if (e.getPosition().equals("Programmer")) {
                mean += e.getSalary() * 12;
                programmersCount++;
            }
        }
        DecimalFormat df = new DecimalFormat("#.00");
        mean /= programmersCount;
        System.out.println("Mean annual salary for programmers is: " + df.format(mean));
    }
}
