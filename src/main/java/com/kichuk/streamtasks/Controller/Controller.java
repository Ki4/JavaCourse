package com.kichuk.streamtasks.Controller;

import com.kichuk.streamtasks.Model.Model;

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
