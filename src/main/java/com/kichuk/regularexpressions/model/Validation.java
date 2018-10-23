package com.kichuk.regularexpressions.model;

import com.kichuk.regularexpressions.view.View;

import java.util.Scanner;

/**
 * Regular Expressions
 * Created by Serhii Kichuk
 */

public class Validation {
    public static final String REG_NAME_OR_SURNAME_OR_PATRONYMIC = "^[A-Z]{1}[a-z]{0,20}$";
    public static final String REG_NICKNAME = "^.{1,20}$";
    public static final String REG_COMMENT = ".*";
    public static final String REG_HOME_NUMBER = "^\\+38\\(0[\\d]{2}\\)[\\d]{7}$";
    public static final String REG_FIRST_MOBILE_NUMBER = "^\\+38\\(0[\\d]{2}\\)[\\d]{7}$";
    public static final String REG_SECOND_MOBILE_NUMBER = "^\\+38\\(0[\\d]{2}\\)[\\d]{7}|$";
    public static final String REG_EMAIL = "^[a-zA-Z\\d][\\w\\.-]{0,15}@[a-zA-Z]{1,10}\\.((com|net|org)(\\.ua)?|ua|ru)$";
    public static final String REG_SKYPE = "^[a-zA-Z\\d][\\w\\.]{0,50}$";
    public static final String REG_INDEX_OF_RESIDENCE = "^[\\d]{5}$";
    public static final String REG_TOWN = "^[A-Z]{1}[a-zA-Z]{2,15}$";
    public static final String REG_STREET = "^[A-Z]{1}[a-zA-Z]{2,15}$";
    public static final String REG_HOUSE_NUMBER = "^[\\d]{1,3}(\\/[\\d]{1,2})?[a-z]?$";
    public static final String REG_APARTMENT_NUMBER = "[\\d]{1,3}$";

    private View view;
    private Scanner scanner;

    public Validation(View view, Scanner scanner) {
        this.scanner = scanner;
        this.view = view;
    }

    public String validation(String regex) {
        String value = scanner.nextLine();
        while (!(value.matches(regex))) {
            view.showWrongInput();
            value = scanner.nextLine();
        }
        return value;
    }

}
