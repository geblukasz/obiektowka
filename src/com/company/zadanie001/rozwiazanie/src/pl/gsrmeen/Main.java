package com.company.zadanie001.rozwiazanie.src.pl.gsrmeen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Bear bear = new Bear("Yogi", 200, 40);
        Tiger tiger = new Tiger("Jataka", 150, 25);
        Wolf wolf = new Wolf("Howler", 70, 40);
        Dog dog = new Dog("Scooby", 30);

        List<Animal> animals = new ArrayList<>();
        animals.addAll(Arrays.asList(bear, tiger, wolf, dog));
        for (Animal a : animals) {
            System.out.print(a.getId() + " : ");
            a.introduce();
        }


        List<Canine> canines = new ArrayList<>();
        canines.addAll(Arrays.asList(wolf, dog));
        for (Canine c : canines) {
            if(c instanceof Animal) {
                Animal a = (Animal) c;
                System.out.print("My name is " + a.getName() + " and I am barking: ");
            }

            c.bark();

            if(c instanceof Dog) {
                Dog d = (Dog) c;
                d.sitPretty();
            }
        }
    }
}
