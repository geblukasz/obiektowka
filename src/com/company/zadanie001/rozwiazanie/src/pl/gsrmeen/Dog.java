package com.company.zadanie001.rozwiazanie.src.pl.gsrmeen;

public class Dog extends Animal  implements Canine {

    public Dog(String name, float weight) {
        super(name, weight);
    }

    @Override
    public void introduce() {
        System.out.println("I'm a dog. My name is " + this.name + ". I weigh " + this.weight + " kg.");
    }

    @Override
    public void bark() {
        System.out.println("bark bark bark");
    }

    public void sitPretty() {
        System.out.println(this.name + " sits pretty.");
    }
}
