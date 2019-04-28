package com.company.zadanie014.rozwiazanie_zad2.src.pl.gsrmeen;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop("ASUS NOVAGO TP370QL", 8));
        laptops.add(new Laptop("ACER PREDATOR 21 X", 38));
        laptops.add(new Laptop("DELL LATITUDE 7390", 19));
        laptops.add(new Laptop("ALIENWARE 15 R3", 29));

        for(Laptop l : laptops) {
            l.introduce();
        }

        for (int i = 0; i < laptops.size(); i++) {
            if(laptops.get(i).getGrade() > 20) {
                System.out.println(laptops.get(i).getName() + " is rated " + laptops.get(i).getGrade() + ".");
            }
        }
    }
}
