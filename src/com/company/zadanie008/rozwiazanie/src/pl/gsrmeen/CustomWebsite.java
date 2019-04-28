package com.company.zadanie008.rozwiazanie.src.pl.gsrmeen;

public class CustomWebsite extends Website {

    public CustomWebsite(String name) {
        super(name);
    }

    @Override
    public void obtainMessage(String message) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            int cValue = (int)c;
            if(isValid(cValue)) {
                sb.append(Character.toUpperCase(c));
                value++;
            } else {
                sb.append(Character.toLowerCase(c));
            }
        }

        System.out.println("[" + name + ", " + value + "] informs: " + sb.toString());
    }

    private static boolean isValid(int cValue) {
        return (cValue >= 97 && cValue <= 107) || (cValue >= 65 && cValue <= 75);
    }
}
