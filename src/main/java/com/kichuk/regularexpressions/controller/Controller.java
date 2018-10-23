package com.kichuk.regularexpressions.controller;


import com.kichuk.regularexpressions.model.Note;
import com.kichuk.regularexpressions.model.Service;
import com.kichuk.regularexpressions.model.Validation;
import com.kichuk.regularexpressions.view.View;

import java.util.Scanner;

/**
 * Created by Serhii Kichuk
 */

public class Controller {
    private View view;
    private Note note;

    public Controller(View view, Note note) {
        this.view = view;
        this.note = note;
    }

    public void processUser() {
        Scanner scanner = new Scanner(System.in);
        Service temporaryNotebook = new Service(view, note, new Validation(view, scanner));
        temporaryNotebook.saveDataToNote();
    }
}
