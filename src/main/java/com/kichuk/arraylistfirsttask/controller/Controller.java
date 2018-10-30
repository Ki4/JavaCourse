package com.kichuk.arraylistfirsttask.controller;

import com.kichuk.arraylistfirsttask.model.Model;

public class Controller {
    private Model model;

    public Controller(Model model) {
        this.model = model;
    }

    public void processUser() {
        model.countRepeatedNumbers(model.createList(model.inputIntNumberValidation()));
    }
}
