package com.kichuk.reflection;

import com.kichuk.reflection.controller.Controller;
import com.kichuk.reflection.model.Model;
import com.kichuk.reflection.view.View;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        Model model = new Model(view);

        Controller controller = new Controller(model);
        controller.processUser();
    }
}
