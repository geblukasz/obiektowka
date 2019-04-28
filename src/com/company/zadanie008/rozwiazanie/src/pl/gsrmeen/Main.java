package com.company.zadanie008.rozwiazanie.src.pl.gsrmeen;

public class Main {

    public static void main(String[] args) {
        Reporter reporter = new Reporter();
        reporter.getClientWebsites().add(new VowelWebsite("Vowel news"));
        reporter.getClientWebsites().add(new ConsonantWebsite("The Consonants"));
        reporter.getClientWebsites().add(new CustomWebsite("Custom Feed"));

        reporter.broadcastMessage("Cows lose their jobs as milk prices drop");

        System.out.println();

        reporter.broadcastMessage("Safety meeting ends in accident");
    }
}
