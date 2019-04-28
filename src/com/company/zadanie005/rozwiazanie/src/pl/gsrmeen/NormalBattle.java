package com.company.zadanie005.rozwiazanie.src.pl.gsrmeen;

import java.util.List;

public class NormalBattle implements Battle {

    @Override
    public int checkWinner(List<Card> deck1, List<Card> deck2, boolean liveOutput) {
        boolean card1Won = false;
        boolean card2Won = false;
        int index1 = 0;
        int index2 = 0;

        while (true) {
            Card c1 = deck1.get(index1);
            Card c2 = deck2.get(index2);


            if (c1.getValue() > c2.getValue()) {
                card1Won = true;
                card2Won = false;
                if (liveOutput) System.out.println(c1.getValue() + " vs " + c2.getValue() + ", player 1 wins");
            } else if (c1.getValue() < c2.getValue()) {
                card1Won = false;
                card2Won = true;
                if (liveOutput) System.out.println(c1.getValue() + " vs " + c2.getValue() + ", player 2 wins");
            } else {
                card1Won = false;
                card2Won = false;
                if (liveOutput) System.out.println(c1.getValue() + " vs " + c2.getValue() + ", draw");
            }

            if (!card1Won) index1++;
            if (!card2Won) index2++;

            if ((index1 >= deck1.size()) && (index2 < deck2.size())) {
                return 1;
            }
            else if ((index2 >= deck2.size()) && (index1 < deck1.size())) {
                return -1;
            }
            else if ((index2 == deck2.size()) && (index1 == deck1.size())){
                return 0;
            }

        }
    }
}
