package com.company.zadanie008.rozwiazanie.src.pl.gsrmeen;

public class VowelWebsite extends Website {

    public VowelWebsite(String name) {
        super(name);
    }

    //samogloski
    @Override
    public void obtainMessage(String message) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if(isVowel(c)) {
                value++;
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(Character.toLowerCase(c));
            }
        }

        System.out.println("[" + name + ", " + value + "] informs: " + sb.toString());
    }

    private static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}
