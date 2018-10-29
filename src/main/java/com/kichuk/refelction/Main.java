package com.kichuk.refelction;

import com.kichuk.refelction.controller.Controller;
import com.kichuk.refelction.model.Model;
import com.kichuk.refelction.view.View;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        Model model = new Model(view);

        Controller controller = new Controller(model);
        controller.processUser();
    }
}
