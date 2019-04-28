package com.company.zadanie007.rozwiazanie.src.pl.gsrmeen;

public class Main {

    public static void main(String[] args) {
        ExchangeOffice exchangeOffice = new ExchangeOffice(1000);

        exchangeOffice.exchange(1000, Currency.PLN, Currency.EUR);
        exchangeOffice.showFunds();

        System.out.println();

        exchangeOffice.exchange(250, Currency.PLN, Currency.RUB);
        exchangeOffice.showFunds();

        System.out.println();

        exchangeOffice.exchange(500, Currency.JPY, Currency.USD);
        exchangeOffice.showFunds();
    }
}
