package com.kichuk.helloworldmvc.controller;

import com.kichuk.helloworldmvc.model.Model;
import com.kichuk.helloworldmvc.view.View;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void process() {
        String message = model.getHelloWorldMessage();
        view.showMessage(message);
    }
}
