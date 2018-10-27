package com.kichuk.streamtasks.Model;

import com.kichuk.streamtasks.VIew.View;

import java.util.Scanner;

public class Model {
    private View view;
    private Service service;
    private static int multiplyNumber;

    private int arrayLength;
    private static final int MIN_NUMBER_FOR_RANDOM_FUNCTION = -10;
    private static final int MAX_NUMBER_FOR_RANDOM_FUNCTION = 20;

    public int[] array;

    public static int getMultiplyNumber() {
        return multiplyNumber;
    }

    public Model() {

    }

    public Model(View view) {
        this.view = view;
    }

    public Model(Service service) {
        this.service = service;
    }

    public void createArray() {
        view.inputLengthOfArray();
        arrayLength = inputIntValueValidation();
        array = new int[arrayLength];
        for (int arrayIndex = 0; arrayIndex < array.length; arrayIndex++) {
            array[arrayIndex] = randomNumberGenerator();
        }
        view.showMessage(array);
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
