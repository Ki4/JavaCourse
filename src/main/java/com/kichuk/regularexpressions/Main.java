package com.kichuk.regularexpressions;

import com.kichuk.regularexpressions.controller.Controller;
import com.kichuk.regularexpressions.view.View;
import com.kichuk.regularexpressions.model.Note;

/**
 * Created by Serhii Kichuk
 */
public class Main {
    public static void main(String[] args) {
        View view = new View();
        Note note = new Note();

        Controller controller = new Controller(view, note);
        controller.processUser();
    }

}
