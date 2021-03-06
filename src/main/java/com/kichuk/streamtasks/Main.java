package com.kichuk.streamtasks;

import com.kichuk.streamtasks.controller.Controller;
import com.kichuk.streamtasks.model.Model;
import com.kichuk.streamtasks.vIew.View;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        Model model = new Model(view);

        Controller controller = new Controller(model);
        controller.processUser();
    }
}
