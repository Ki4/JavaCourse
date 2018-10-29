package com.kichuk.streamtasks.model;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Service {
    public double averageNumberOfArray(int[] array) {
        return IntStream.of(array).average().getAsDouble();
    }

    public int minimumNumberOfArray(int[] array) {
        return IntStream.of(array).min().getAsInt();
    }

    public int minimumIndexOfArray(int[] array) {
        return IntStream.of(array).boxed().collect(Collectors.toList()).indexOf(minimumNumberOfArray(array));
    }

    public int theNumberOfElementsThatEqualToZero(int[] array) {
        return (int) IntStream.of(array).filter(arr -> arr == 0).count();
    }

    public int theNumberOfElementsThatGreaterThanZero(int[] array) {
        return (int) IntStream.of(array).filter(arr -> arr > 0).count();
    }

    public int[] multiplyArrayElements(int[] array) {
        return IntStream.of(array).map(arr -> arr * Model.getMultiplyNumber()).toArray();
    }
}
