package com.kichuk.helloworldmvc;

import com.kichuk.helloworldmvc.controller.Controller;
import com.kichuk.helloworldmvc.model.Model;
import com.kichuk.helloworldmvc.view.View;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();

        Controller controller = new Controller(model, view);

        controller.process();
    }
}
