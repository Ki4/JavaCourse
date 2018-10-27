package com.kichuk.streamtasks;

import com.kichuk.streamtasks.Controller.Controller;
import com.kichuk.streamtasks.Model.Model;
import com.kichuk.streamtasks.VIew.View;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        Model model = new Model(view);

        Controller controller = new Controller(model);
        controller.processUser();
    }
}
