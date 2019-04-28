package com.company.zadanie002.rozwiazanie.src.pl.gsrmeen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankAccount3 {
    private int balance;
    private double interestRate;

    public BankAccount3(int balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }


    public ActionListener createBalanceCounter() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int newBalance = (int) (BankAccount3.this.balance + balance * interestRate);
                System.out.println("Changing account balance from " + balance + " to: " + newBalance);
                BankAccount3.this.balance = newBalance;
            }
        };
    }


    //Getters and setters
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
