package com.kichuk.moreorless.view;

import java.util.List;

import static com.kichuk.moreorless.util.UtilConstants.*;

public class View {
    public void printLessMessage(int userNumber) {
        System.out.println(VICTORY_NUMBER_LOWER_THAN_MESSAGE + userNumber);
    }

    public void printMoreMessage(int userNumber) {
        System.out.println(VICTORY_NUMBER_MORE_THAN_MESSAGE + userNumber);
    }

    public void printUserVictoryMessage(List<Integer> userHistory, int numberOfAttempts) {
        System.out.println(SUCCEED_MESSAGE);
        System.out.println(NUMBER_OF_ATTEMPTS_MESSAGE + numberOfAttempts);
        System.out.println(userHistory);
    }

    public void printUserIncorrectInput() {
        System.out.println(INCORRECT_INPUT_DATA_MESSAGE);
    }

    public void printInputYourNumber() {
        System.out.println(INPUT_NUMBER_MESSAGE);
    }

    public void inputLowerBoarder() {
        System.out.println(INPUT_LOWER_BOARDER_MESSAGE);
    }

    public void inputUpperBoarder() {
        System.out.println(INPUT_UPPER_BOARDER_MESSAGE);
    }

    public void incorrectUpperBoarder(){
        System.out.println(INCORRECT_UPPER_BOARDER);
    }
}
