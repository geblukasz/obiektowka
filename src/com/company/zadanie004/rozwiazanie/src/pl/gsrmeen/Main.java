package com.company.zadanie004.rozwiazanie.src.pl.gsrmeen;
public class Main {

    public static void main(String[] args) {
        Blog blog = new Blog();

        blog.getUsers().add(new User("Jan", "Nowak", "janek95"));
        blog.getUsers().add(new User("Michał", "Kowalski", "xxmichuxx"));
        blog.getUsers().add(new User("Marian", "Nowakowski", "marian_dev"));

        blog.publishPost(1, "Żyrafa najwyższą formą życia.");
        blog.publishPost(2, "Czas nie zawsze przemija w jednakowym rytmie. To my o tym decydujemy.");
        blog.publishPost(3, "Jaki jest obiektowy sposób na zdobycie fortuny? Dziedzieczenie!");
        blog.publishPost(100, "Lorem ipsum dolor sit amet, consectetur adipiscing elit.");

        System.out.println();

        blog.commentPost(3, 1, "Najwyższą formą życia jest żyrafa stojąca na taborecie!");
        blog.commentPost(1, 2, "To bardzo prawdziwe. Chyba cytat z Paulo Coelho.");
        blog.commentPost(2, 2, "Mądre słowa.");
        blog.commentPost(1, 3, "Tak, a grupa krwi programisty to C++!");
        blog.commentPost(2, 3, "Haha, usmialem sie!");

        System.out.println();

        blog.displayUserEntries(1);
    }
}
