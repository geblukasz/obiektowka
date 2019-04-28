package com.company.zadanie011.rozwiazanie.src.pl.gsrmeen;

public class Car {
    public static final String UNKNOWN = "UNKNOWN";


    // required
    private String manufacturer;
    private int age;
    private double engineCapacity;

    // optional
    private String model;
    private String color;
    private int horsePower;
    private boolean hasTurbo;

    private Car(CarBuilder builder) {
        this.manufacturer = builder.manufacturer;
        this.age = builder.age;
        this.engineCapacity = builder.engineCapacity;

        this.model = builder.model;
        this.color = builder.color;
        this.horsePower = builder.horsePower;
        this.hasTurbo = builder.hasTurbo;
    }


    @Override
    public String toString() {
        return String.format("{ %s %.2f (%d), %s %s %d %b }",
                manufacturer, engineCapacity, age, model, color, horsePower, hasTurbo);
    }


    public String getManufacturer() {
        return manufacturer;
    }

    public int getAge() {
        return age;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public boolean hasTurbo() {
        return hasTurbo;
    }

    public static class CarBuilder {
        // required
        private String manufacturer;
        private int age;
        private double engineCapacity;

        // optional
        private String model = Car.UNKNOWN;
        private String color = Car.UNKNOWN;
        private int horsePower = -1;
        private boolean hasTurbo = false;

        public CarBuilder(String manufacturer, int age, double engineCapacity) {
            this.manufacturer = manufacturer;
            this.age = age;
            this.engineCapacity = engineCapacity;
        }

        public Car build() {
            return  new Car(this);
        }

        public CarBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder setHorsePower(int horsePower) {
            this.horsePower = horsePower;
            return this;
        }

        public CarBuilder setHasTurbo(boolean hasTurbo) {
            this.hasTurbo = hasTurbo;
            return this;
        }
    }
}
