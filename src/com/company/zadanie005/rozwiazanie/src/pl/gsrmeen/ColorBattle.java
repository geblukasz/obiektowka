package com.company.zadanie005.rozwiazanie.src.pl.gsrmeen;

import java.util.List;

public class ColorBattle implements Battle {

    @Override
    public int checkWinner(List<Card> deck1, List<Card> deck2, boolean liveOutput) {
        int colorValue1 = 0;
        for (Card c : deck1) {
            colorValue1 += c.getColor().getValue();
        }

//        int sum = deck1.forEach(x -> x.getValue());

        Integer sum = deck1.stream()
                .map(x -> x.getValue())
                .reduce(0, Integer::sum);

        if (liveOutput) System.out.println("Deck 1 color value is " + colorValue1 + ".");

        int colorValue2 = 0;
        for (Card c : deck2) {
            colorValue2 += c.getColor().getValue();
        }
        if (liveOutput) System.out.println("Deck 2 color value is " + colorValue2 + ".");

        if (colorValue1 > colorValue2)
            return 1;
        else if (colorValue1 < colorValue2)
            return -1;
        else
            return 0;
    }
}
