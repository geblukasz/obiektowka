package com.company.zadanie003.rozwiazanie.src.pl.gsrmeen;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class Restaurant {
    private Timer dishGeneratorTimer;
    private HashMap<Dish, Integer> stock;
    private int moneyEarned;
    private int moneyLost;

    private static final int COOKING_EFFICIENCY = 1;
    private static final int COOKING_SPEED = 5;

    public Restaurant(int baseAmount) {
        initStock(baseAmount);
        moneyEarned = 0;
        moneyLost = 0;
    }

    public boolean order(Dish dishOrdered, int timesOrdered) {
        synchronized (stock) {
            int timesAvailable = stock.get(dishOrdered);
            int orderValue = dishOrdered.getPrice() * timesOrdered;
            if (timesAvailable >= timesOrdered) {
                stock.put(dishOrdered, timesAvailable - timesOrdered);
                moneyEarned += orderValue;
                return true;
            } else {
                moneyLost += orderValue;
                return false;
            }
        }
    }

    private void initStock(int baseAmount) {
        stock = new HashMap<>();
        stock.put(Dish.IceCream, baseAmount);
        stock.put(Dish.Gyros, baseAmount);
        stock.put(Dish.Tortilla, baseAmount);
        stock.put(Dish.Pizza, baseAmount);
        stock.put(Dish.Steak, baseAmount);
    }

    public void startCooking() {
        ActionListener listener = e -> {
            synchronized (stock) {
                System.out.print("Money earned|lost: " + moneyEarned + "|" + moneyLost + " Current stock: ");
                for (Map.Entry<Dish, Integer> entry : stock.entrySet()) {
                    entry.setValue(entry.getValue() + COOKING_EFFICIENCY);
                    System.out.print(entry.getValue() + " " + entry.getKey().name()+ "  ");
                }
                System.out.print("\n");
            }
        };

        dishGeneratorTimer = new Timer(COOKING_SPEED * 1000, listener);
        dishGeneratorTimer.setInitialDelay(COOKING_SPEED * 1000);
        dishGeneratorTimer.start();
    }
}
