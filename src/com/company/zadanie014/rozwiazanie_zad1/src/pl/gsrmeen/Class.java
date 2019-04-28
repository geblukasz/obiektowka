package com.company.zadanie014.rozwiazanie_zad1.src.pl.gsrmeen;

import java.util.ArrayList;
import java.util.List;

public class Class {
    private List<String> studentNames;

    public Class() {
        this.studentNames = new ArrayList<>();
    }

    public void addStudent(String name) {
        studentNames.add(name);
    }

    public void displayStudents() {
        if(studentNames.size()==0)
            System.out.println("This class has no students");
        else {
            System.out.print("Students: ");
            for (int i = 0; i < studentNames.size(); i++) {
                System.out.print(studentNames.get(i));
                if(i < studentNames.size() -1)
                    System.out.print(", ");
            }
            System.out.print(".\n");
        }
    }

    public int getGirlsCount() {
        int rc = 0;
        for (int i = 0; i < studentNames.size(); i++) {
            if(studentNames.get(i).endsWith("a"))
                rc++;
        }
        return rc;
    }
}
