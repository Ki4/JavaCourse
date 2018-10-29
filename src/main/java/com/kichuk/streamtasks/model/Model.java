package com.kichuk.streamtasks.model;

import com.kichuk.streamtasks.vIew.View;

import java.util.Scanner;

public class Model {
    private View view;
    private Service service = new Service();
    private static int multiplyNumber;

    private int arrayLength;
    private static final int MIN_NUMBER_FOR_RANDOM_FUNCTION = -10;
    private static final int MAX_NUMBER_FOR_RANDOM_FUNCTION = 20;

    private int[] array;

    public Model() {

    }

    public Model(View view) {
        this.view = view;
    }

    public static int getMultiplyNumber() {
        return multiplyNumber;
    }

    public void createArray() {
        view.inputLengthOfArray();
        arrayLength = inputIntValueValidation();
        array = new int[arrayLength];
        for (int arrayIndex = 0; arrayIndex < array.length; arrayIndex++) {
            array[arrayIndex] = randomNumberGenerator();
        }
    }

    public void inputTheMultiplyNumber() {
        view.inputMultipliedNumber();
        multiplyNumber = inputIntValueValidation();
    }

    public int inputIntValueValidation() {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            view.inccorectData();
            scanner.next();
        }
        return scanner.nextInt();
    }

    public int randomNumberGenerator() {
        return MIN_NUMBER_FOR_RANDOM_FUNCTION + (int) (Math.random() * MAX_NUMBER_FOR_RANDOM_FUNCTION);
    }

    public void turnOnTheStreamMethods() {
        view.showMessage(service.averageNumberOfArray(array));
        view.showMessage(service.minimumNumberOfArray(array));
        view.showMessage(service.minimumIndexOfArray(array));
        view.showMessage(service.theNumberOfElementsThatEqualToZero(array));
        view.showMessage(service.theNumberOfElementsThatGreaterThanZero(array));
        view.showMessage(service.multiplyArrayElements(array));
    }
}
