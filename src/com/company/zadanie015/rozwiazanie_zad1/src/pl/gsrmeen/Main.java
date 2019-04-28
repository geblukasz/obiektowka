package com.company.zadanie015.rozwiazanie_zad1.src.pl.gsrmeen;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Small dog", "woof", false));
        animals.add(new Animal("Big dog", "woof", true));
        animals.add(new Animal("Cow", "moo", true));
        animals.add(new Animal("Frog", "croak", false));

        Random r = new Random();

        System.out.println("Loud animals");
        for(Animal a : animals) {
            if(a.isLoud()) {
                System.out.print(a.getName() + " : ");
                a.speak(r.nextInt(4) + 1);
            }
        }


        System.out.println("\nSilent animals");
        for(Animal a : animals) {
            if(!a.isLoud()) {
                System.out.print(a.getName() + " : ");
                a.speak(r.nextInt(4) + 1);
            }
        }
    }
}
