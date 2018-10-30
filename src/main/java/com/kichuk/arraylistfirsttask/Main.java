package com.kichuk.arraylistfirsttask;

import com.kichuk.arraylistfirsttask.controller.Controller;
import com.kichuk.arraylistfirsttask.model.Model;
import com.kichuk.arraylistfirsttask.view.View;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        Model model = new Model(view);
        Controller controller = new Controller(model);
        controller.processUser();
    }
}
