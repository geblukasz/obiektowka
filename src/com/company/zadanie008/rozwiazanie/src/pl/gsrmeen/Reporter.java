package com.company.zadanie008.rozwiazanie.src.pl.gsrmeen;

import java.util.ArrayList;
import java.util.List;

public class Reporter {
    private List<Website> clientWebsites;

    public Reporter() {
        clientWebsites = new ArrayList<>();
    }

    public void broadcastMessage(String message) {
        for (Website w : clientWebsites) {
            w.obtainMessage(message);
        }
    }

    public List<Website> getClientWebsites() {
        return clientWebsites;
    }
}
