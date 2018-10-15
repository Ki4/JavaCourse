package com.kichuk.regularexpressions.model;

public class Validation {
    public static final String REG_NAME_OR_SURNAME_OR_PATRONyMIC = "^[A-Z]{1}[a-z]{0,254}$";
    public static final String REG_NICKNAME = "^.{1,20}$";
    public static final String REG_COMMENT = ".*";
    public static final String REG_HOME_NUMBER = "^[0,9]$";
    public static final String REG_FIRST_OR_SECOND_MOBILE_NUMBER = "^\\+38\\(0[\\d]{2}\\)[\\d]{7}$";
    public static final String REG_EMAIL = "^(\\+38\\(0[\\d]{2}\\)[\\d]{7}|)$";
    public static final String REG_SKYPE = "^[a-zA-Z\\d][\\w\\.]{0,50}$";
    public static final String REG_INDEX_OF_RESIDENCE = "^[\\d]{5}$";
    public static final String REG_TOWN = "^([A-Z]{1}[a-z]{0,254} + (\\s|-)?){0,10}$";
    public static final String REG_STREET = "^[A-Z]{1}[a-z]{0,254}$";
    public static final String REG_HOUSE_NUMBER = "^[\\d]{1,3}(\\/[\\d]{1,2})?[a-z]?$";
    public static final String REG_APARTMENT_NUMBER = "[\\d]{1,3}$";

}
