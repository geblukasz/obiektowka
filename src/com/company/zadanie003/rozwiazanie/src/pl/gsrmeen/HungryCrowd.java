package com.company.zadanie003.rozwiazanie.src.pl.gsrmeen;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.BiPredicate;

public class HungryCrowd {
    private static final int DELAY_MIN = 1;
    private static final int DELAY_MAX = 4;
    private static final int ORDER_MIN = 2;
    private static final int ORDER_MAX = 6;

    private Timer timer;
    private BiPredicate<Dish, Integer> orderAction;

    public HungryCrowd(BiPredicate<Dish, Integer>  orderAction) {
        this.orderAction = orderAction;
        this.timer = new Timer();
    }

    public void startOrdering(){
        this.timer.schedule(new OrderTask(), 0);
    }

    public class OrderTask extends TimerTask {
        @Override
        public void run() {
            int nextDelay = ThreadLocalRandom.current().nextInt(DELAY_MIN, DELAY_MAX);
            int timesOrdered = ThreadLocalRandom.current().nextInt(ORDER_MIN, ORDER_MAX);
            Dish dishToOrder = Dish.values()[ThreadLocalRandom.current().nextInt(0, Dish.values().length)];

            if (orderAction.test(dishToOrder, timesOrdered)) {
                System.out.println("Successfully ordered " + timesOrdered + " " + dishToOrder.name());
            } else {
                System.out.println("Couldn't order " + timesOrdered + " " + dishToOrder.name());
            }
            timer.schedule(new OrderTask(), nextDelay * 1000);
        }
    }
}
