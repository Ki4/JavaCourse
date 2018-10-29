package com.kichuk.reflection.controller;

import com.kichuk.reflection.model.Model;
import com.kichuk.reflection.model.Truck;

public class Controller {
    private Model model;

    public Controller(Model model) {
        this.model = model;
    }

    public void processUser() {
        model.reflectionTestMethods();
        model.showNamesAboutClassAndInterface(Truck.class);
    }
}
