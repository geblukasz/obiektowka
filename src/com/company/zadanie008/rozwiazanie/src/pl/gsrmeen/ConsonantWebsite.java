package com.company.zadanie008.rozwiazanie.src.pl.gsrmeen;

public class ConsonantWebsite extends Website {

    public ConsonantWebsite(String name) {
        super(name);
    }

    @Override
    public void obtainMessage(String message) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if(isConsonant(c)) {
                sb.append(Character.toUpperCase(c));
                value++;
            } else {
                sb.append(Character.toLowerCase(c));
            }
        }

        System.out.println("[" + name + ", " + value + "] informs: " + sb.toString());
    }


    private static boolean isConsonant(char c) {
        return "AEIOUaeiou".indexOf(c) == -1;
    }
}
