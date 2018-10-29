package com.kichuk.refelction.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car {
    private String brand;
    private int numberOfCylinders;
    private double power;

    public Car(String brand, int numberOfCylinders, double power) {
        this.brand = brand;
        this.numberOfCylinders = numberOfCylinders;
        this.power = power;
    }

}
