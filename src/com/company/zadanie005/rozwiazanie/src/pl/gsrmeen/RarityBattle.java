package com.company.zadanie005.rozwiazanie.src.pl.gsrmeen;

import java.util.Collections;
import java.util.List;

public class RarityBattle implements Battle {
    @Override
    public int checkWinner(List<Card> deck1, List<Card> deck2, boolean liveOutput) {
        int deck1RareCounter = 0;
        for (Card c : deck1) {
            if (c.isRare()) deck1RareCounter++;
        }
        if (liveOutput) System.out.println("Deck 1 contains " + deck1RareCounter + " rare cards.");

        int deck2RareCounter = 0;
        for (Card c : deck2) {
            if (c.isRare()) deck2RareCounter++;
        }
        if (liveOutput) System.out.println("Deck 2 contains " + deck2RareCounter + " rare cards.");

        if (deck1RareCounter > deck2RareCounter)
            return 1;
        else if (deck1RareCounter < deck2RareCounter)
            return -1;
        else
            return 0;
    }
}
