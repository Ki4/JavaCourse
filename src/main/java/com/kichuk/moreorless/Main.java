package com.kichuk.moreorless;

import com.kichuk.moreorless.controller.Controller;
import com.kichuk.moreorless.model.Model;
import com.kichuk.moreorless.view.View;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        Model model = new Model(view);

        Controller controller = new Controller(model);
        controller.process();
    }
}
