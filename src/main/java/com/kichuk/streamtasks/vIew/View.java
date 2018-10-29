package com.kichuk.streamtasks.vIew;

import java.util.stream.IntStream;

import static com.kichuk.streamtasks.util.Util.INCORRECT_INPUT_DATA;
import static com.kichuk.streamtasks.util.Util.INPUT_THE_LENGTH_OF_ARRAY;
import static com.kichuk.streamtasks.util.Util.INPUT_THE_NUMBER_FOR_MULTIPLY;

public class View {
    public void inccorectData() {
        System.out.println(INCORRECT_INPUT_DATA);
    }

    public void inputLengthOfArray() {
        System.out.println(INPUT_THE_LENGTH_OF_ARRAY);
    }

    public void inputMultipliedNumber() {
        System.out.println(INPUT_THE_NUMBER_FOR_MULTIPLY);
    }

    public void showMessage(int message) {
        System.out.println(message);
    }

    public void showMessage(double message) {
        System.out.println(message);
    }

    public void showMessage(int[] array) {
        IntStream.of(array).forEachOrdered(System.out::println);
    }
}
