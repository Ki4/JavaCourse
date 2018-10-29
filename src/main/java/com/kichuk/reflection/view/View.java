package com.kichuk.reflection.view;

import static com.kichuk.reflection.util.UtilConstants.*;

public class View {
    public void incorrectData() {
        System.out.println(INCORRECT_INPUT);
    }

    public void tooMuchGoods() {
        System.out.println(TOO_MUCH_GOODS);
    }

    public void inputVolumeOfGoods() {
        System.out.println(INPUT_VOLUME_OF_GOODS);
    }

    public void showFreeSpace(double freeSpace) {
        System.out.println(FREE_SPACE + freeSpace);
    }

    public void showTruckIsFree() {
        System.out.println(TRUCK_IS_FREE);
    }

    public void showNameOfTheClass(String name) {
        System.out.println(NAME_OF_THE_CLASS + name);
    }

    public void showNameOfInterface(Class<?>[] interfaces) {
        System.out.println(NAME_OF_INTERFACES + interfaces);
    }
}
