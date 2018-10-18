package com.kichuk.regularexpressions.view;

import com.kichuk.regularexpressions.util.UtilConstants;

public class View {
    public void showMessage(String message) {
        System.out.println(message);
    }

    public void showWrongInput() {
        showMessage(UtilConstants.INCORRECT_INPUT_DATA_MESSAGE);
    }

    public void inputName() {
        showMessage(UtilConstants.INPUT_NAME);
    }

    public void inputSurname() {
        showMessage(UtilConstants.INPUT_SURNAME);
    }

    public void inputPatronymic() {
        showMessage(UtilConstants.INPUT_PATRONYMIC);
    }

    public void inputNickname() {
        showMessage(UtilConstants.INPUT_NICKNAME);
    }

    public void inputComment() {
        showMessage(UtilConstants.INPUT_COMMENT);
    }

    public void inputHomePhone() {
        showMessage(UtilConstants.INPUT_HOME_PHONE);
    }

    public void inputFirstMobilePhone() {
        showMessage(UtilConstants.INPUT_FIRST_MOBILE_PHONE);
    }

    public void inputSecondMobilePhone() {
        showMessage(UtilConstants.INPUT_SECOND_MOBILE_PHONE);
    }

    public void inputEmail() {
        showMessage(UtilConstants.INPUT_EMAIL);
    }

    public void inputSkype() {
        showMessage(UtilConstants.INPUT_SKYPE);
    }

    public void inputIndex() {
        showMessage(UtilConstants.INPUT_INDEX_OF_RESIDENCE);
    }

    public void inputTown() {
        showMessage(UtilConstants.INPUT_TOWN);
    }

    public void inputStreet() {
        showMessage(UtilConstants.INPUT_STREET);
    }

    public void inputHouseNumber() {
        showMessage(UtilConstants.INPUT_HOUSE_NUMBER);
    }

    public void inputApartmentNumber() {
        showMessage(UtilConstants.INPUT_APARTMENT_NUMBER);
    }
}
