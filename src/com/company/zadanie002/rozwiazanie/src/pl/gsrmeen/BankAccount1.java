package com.company.zadanie002.rozwiazanie.src.pl.gsrmeen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankAccount1 {
    private int balance;

    public BankAccount1(int balance) {
        this.balance = balance;
    }


    public class BalanceCounter implements ActionListener {

        private double interestRate;

        public BalanceCounter(double interestRate) {
            this.interestRate = interestRate;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            int newBalance = (int) (BankAccount1.this.balance + balance * interestRate);
            System.out.println("Changing account balance from " + balance + " to: " + newBalance);
            BankAccount1.this.balance = newBalance;
        }
    }

    //Getters and setters
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
