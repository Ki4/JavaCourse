package com.kichuk.streamtasks.Controller;

import com.kichuk.streamtasks.Model.Model;
import com.kichuk.streamtasks.VIew.View;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Model start = new Model(view);
        start.createArray();
        start.inputTheMultiplyNumber();
        start.turnOnTheStreamMethods();
    }
}
