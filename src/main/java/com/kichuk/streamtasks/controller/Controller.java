package com.kichuk.streamtasks.controller;

import com.kichuk.streamtasks.model.Model;

public class Controller {
    private Model model;

    public Controller(Model model) {
        this.model = model;
    }

    public void processUser() {
        model.createArray();
        model.inputTheMultiplyNumber();
        model.turnOnTheStreamMethods();
    }
}
