package com.kichuk.regularexpressions;

import com.kichuk.regularexpressions.view.View;
import com.kichuk.regularexpressions.model.Note;

public class Main {
    public static void main(String[] args) {
        Note note = new Note();
        View view = new View();

        Controller controller = new Controller(note, view);

    }

}
