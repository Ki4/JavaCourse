package com.kichuk.moreorless.controller;

import com.kichuk.moreorless.model.Model;

public class Controller {
    private Model model;

    public Controller(Model model) {
        this.model = model;
    }

    public void process() {
        model.startGame();
    }
}
