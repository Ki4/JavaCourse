package com.kichuk.arraylistfirsttask.model;

import com.kichuk.arraylistfirsttask.view.View;

import java.util.*;

public class Model {
    private View view;

    public Model(View view) {
        this.view = view;
    }

    ArrayList<Integer> arrayList = new ArrayList<>();
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();


    public int inputIntNumberValidation() {
        Scanner scanner = new Scanner(System.in);
        view.inputArraySize();
        while (!scanner.hasNextInt()) {
            view.incorrectInputData();
            scanner.next();
        }
        return scanner.nextInt();
    }

    public ArrayList<Integer> createList(int arrayListSize) {
        Random random = new Random();
        for (int i = 0; i < arrayListSize; i++) {
            arrayList.add(random.nextInt(10) - 5);
        }
        view.showList(arrayList);
        return arrayList;
    }

    public HashMap<Integer, Integer> countRepeatedNumbers(ArrayList<Integer> list) {
        for (Integer key: list) {
            if(map.containsKey(key)){
                int value = map.get(key) + 1;
                map.put(key, value);
            }
            else{
                map.put(key, 1);
            }
        }
        view.showMap(map);
        return map;
    }
}
