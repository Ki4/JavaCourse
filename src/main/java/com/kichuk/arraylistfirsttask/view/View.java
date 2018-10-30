package com.kichuk.arraylistfirsttask.view;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

import static com.kichuk.arraylistfirsttask.util.UtilConstants.*;

public class View {
    public void incorrectInputData() {
        System.out.println(INCORRECT_INPUT_DATA);
    }

    public void showList(List<Integer> arrayList) {
        for (Integer showList: arrayList) {
            System.out.print(showList + SPACE);
        }
    }

    public void inputArraySize() {
        System.out.println(INPUT_ARRAY_SIZE);
    }

    public void showMap(HashMap<Integer, Integer> map) {
        Set<Integer> showMap = map.keySet();
        for (Integer show: showMap) {
            System.out.println(show + DASH + map.get(show));
        }
    }
}
