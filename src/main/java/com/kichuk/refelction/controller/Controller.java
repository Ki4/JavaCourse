package com.kichuk.refelction.controller;

import com.kichuk.refelction.model.Model;
import com.kichuk.refelction.model.Truck;

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
