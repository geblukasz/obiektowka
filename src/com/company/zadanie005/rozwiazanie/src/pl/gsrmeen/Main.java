package com.company.zadanie005.rozwiazanie.src.pl.gsrmeen;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.print("Deck with 5 cards, seed 10: ");
        printDeck(createDeck(10, 5));
        System.out.print("Deck with 5 cards, seed 15: ");
        printDeck(createDeck(15, 5));

        Battle battle;

        battle = new ColorBattle();
        System.out.println("Sizes 5, seeds 10 15, color battle result: " + battle.checkWinner(createDeck(10, 5), createDeck(15, 5), false));
        System.out.println("Sizes 5, seeds 15 10, color battle result: " + battle.checkWinner(createDeck(15, 5), createDeck(10, 5), false));
        System.out.println("Sizes 5, seeds 30 30, color battle result: " + battle.checkWinner(createDeck(30, 5), createDeck(30, 5), false));

        battle = new RarityBattle();
        System.out.println("Sizes 5, seeds 10 15, rarity battle result: " + battle.checkWinner(createDeck(10, 5), createDeck(15, 5), false));
        System.out.println("Sizes 5, seeds 15 10, rarity battle result: " + battle.checkWinner(createDeck(15, 5), createDeck(10, 5), false));
        System.out.println("Sizes 5, seeds 30 30, rarity battle result: " + battle.checkWinner(createDeck(30, 5), createDeck(30, 5), false));

        battle = new NormalBattle();
        System.out.println("Sizes 5, seeds 10 15, normal battle result: " + battle.checkWinner(createDeck(10, 5), createDeck(15, 5), false));
        System.out.println("Sizes 5, seeds 15 10, normal battle result: " + battle.checkWinner(createDeck(15, 5), createDeck(10, 5), false));
        System.out.println("Sizes 5, seeds 30 30, normal battle result: " + battle.checkWinner(createDeck(30, 5), createDeck(30, 5), false));

    }

    public static List<Card> createDeck(int randSeed, int deckSize) {
        List<Card> rc = new ArrayList<>();
        Random random = new Random(randSeed);
        for (int i = 0; i < deckSize; i++) {
            int cValue = random.nextInt(10) + 1;
            CardColor cColor = CardColor.values()[random.nextInt(CardColor.values().length)];
            boolean cRare = random.nextBoolean();
            rc.add(new Card(cValue, cColor, cRare));
        }
        return rc;
    }

    public static void printDeck(List<Card> cards) {
        for (Card c : cards) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
