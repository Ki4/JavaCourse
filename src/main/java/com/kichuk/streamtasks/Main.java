package com.kichuk.streamtasks;

import com.kichuk.streamtasks.Controller.Controller;
import com.kichuk.streamtasks.Model.Model;
import com.kichuk.streamtasks.VIew.View;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();

        Controller controller = new Controller(model, view);
        controller.processUser();
    }
}
