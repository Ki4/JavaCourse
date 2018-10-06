package com.kichuk.moreorless.model;

import com.kichuk.moreorless.view.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Model {
    private View view;

    public Model(View view) {
        this.view = view;
    }

    public void startGame() {
        view.inputLowerBoarder();
        int lowerBoarder = inputIntValue();
        view.inputUpperBoarder();
        int upperBoarder = inputIntValue();
        while (upperBoarder < lowerBoarder) {
            view.incorrectUpperBoarder();
            upperBoarder = inputIntValue();
        }
        List<Integer> userHistory = new ArrayList<>();
        int attempts = 0;

        int victoryNumber = generateRandomNumber(lowerBoarder, upperBoarder);
        view.printInputYourNumber();
        int userNumber = inputIntValue();

        while (userNumber != victoryNumber) {
            if (userNumber > victoryNumber) {
                view.printLessMessage(userNumber);
            } else {
                view.printMoreMessage(userNumber);
            }
            userHistory.add(userNumber);
            attempts++;
            userNumber = inputIntValue();
        }
        attempts++;
        userHistory.add(userNumber);
        view.printUserVictoryMessage(userHistory, attempts);
    }

    private int inputIntValue() {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            view.printUserIncorrectInput();
            scanner.next();
        }
        return scanner.nextInt();
    }

    private int generateRandomNumber(int lowerBoarder, int upperBoarder) {
        if (upperBoarder < 0) {
            upperBoarder *= -1;
        }
        return lowerBoarder + (int) (Math.random() * upperBoarder);
    }
}