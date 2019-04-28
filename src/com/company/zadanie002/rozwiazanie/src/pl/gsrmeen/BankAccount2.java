
package com.company.zadanie002.rozwiazanie.src.pl.gsrmeen;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankAccount2 {
    private int balance;

    public BankAccount2(int balance) {
        this.balance = balance;
    }


    public ActionListener createBalanceCounter(double interestRate) {
        class BalanceCounter implements ActionListener {
            double interestRate;

            public BalanceCounter(double interestRate) {
                this.interestRate = interestRate;
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                int newBalance = (int) (BankAccount2.this.balance + BankAccount2.this.balance * interestRate);
                System.out.println("Changing account balance from " + BankAccount2.this.balance + " to: " + newBalance);
                BankAccount2.this.balance = newBalance;
            }
        }

        return new BalanceCounter(interestRate);
    }


    //Getters and setters
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
