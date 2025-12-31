package com.maven;

class Vehicle {

    void start() {
        System.out.println("Vehicle starts");
    }

    void engine() {
        System.out.println("Vehicle has an engine");
    }
}

class Car extends Vehicle {

    void start() {
        super.start();
        System.out.println("Car starts");
    }

    void engine() {
        super.engine();
        System.out.println("Car has a petrol engine");
    }
}

class ElectricCar extends Car {

    void start() {
        super.start();
        System.out.println("Electric car starts silently");
    }

    void engine() {
        System.out.println("Electric car has an electric motor");
    }
}

public class vehicle {
    public static void main(String[] args) {

        ElectricCar ec = new ElectricCar();

        ec.start();
        ec.engine();
    }
}

