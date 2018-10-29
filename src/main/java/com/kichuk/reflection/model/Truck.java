package com.kichuk.reflection.model;

import com.kichuk.reflection.view.View;

public class Truck extends Car implements ITruck {
    private View view = new View();
    private Model model = new Model(view);
    private double loadCapacity;
    private double freeSpace;
    private double volumeOfGoods;

    public Truck(String brand, int numberOfCylinders, double power, double loadCapacity, double volumeOfGoods) {
        super(brand, numberOfCylinders, power);
        this.loadCapacity = loadCapacity;
        this.freeSpace = loadCapacity;
        this.volumeOfGoods = volumeOfGoods;
    }

    @Override
    @TestAnnotation
    public void loadingGoods() {
        view.inputVolumeOfGoods();
        volumeOfGoods = model.inputDoubleValidation();
        if (volumeOfGoods > freeSpace) {
            view.tooMuchGoods();
            return;
        }
        freeSpace -= volumeOfGoods;
        view.showFreeSpace(freeSpace);

    }

    @Override
    @TestAnnotation
    public void unloadingGoods() {
        freeSpace = loadCapacity;
        view.showTruckIsFree();
    }
}

