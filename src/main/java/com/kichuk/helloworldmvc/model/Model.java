package com.kichuk.helloworldmvc.model;

import java.util.Scanner;

import static com.kichuk.helloworldmvc.util.UtilConstants.*;

public class Model {
    public String getHelloWorldMessage() {
        String firstInput = validAndReturnInput(HELLO_WORD);
        String secondInput = validAndReturnInput(WORLD_WORD);

        return firstInput + SPACE + secondInput;
    }

    private String validAndReturnInput(String keyWord) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        while (!input.equals(keyWord)) {
            System.out.println(INCORRECT_INPUT);
            input = sc.next();
        }

        return input;
    }
}
