package com.kichuk.regularexpressions.model;

import com.kichuk.regularexpressions.view.View;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Filling and validation call
 */

import static com.kichuk.regularexpressions.util.UtilConstants.*;

public class Service {
    private View view;
    private Note note;
    private Validation validation;

    private String name;
    private String surname;
    private String patronymic;
    private String presentationFormOfPerson;
    private String nickname;
    private String comment;
    private String homePhone;
    private String firstMobilePhone;
    private String secondMobilePhone;
    private String email;
    private String skype;
    private String indexOfResidence;
    private String town;
    private String street;
    private String houseNumber;
    private String apartmentNumber;
    private String adress;
    private String dateOfCreation;
    private String dateOfChange;

    public Service(View view, Note note, Validation validation) {
        this.view = view;
        this.note = note;
        this.validation = validation;
    }

    public void saveDataToNote() {
        saveInputData();
        note.setName(name);
        note.setSurname(surname);
        note.setPatronymic(patronymic);
        note.setPresentationFormOfPerson(presentationFormOfPerson);
        note.setNickname(nickname);
        note.setComment(comment);
        note.setHomePhone(homePhone);
        note.setFirstMobilePhone(firstMobilePhone);
        note.setSecondMobilePhone(secondMobilePhone);
        note.setSecondMobilePhone(email);
        note.setSecondMobilePhone(skype);
        note.setAdress(adress);
        note.setSecondMobilePhone(indexOfResidence);
        note.setSecondMobilePhone(town);
        note.setSecondMobilePhone(street);
        note.setSecondMobilePhone(houseNumber);
        note.setApartmentNumber(apartmentNumber);
        note.setDateOfCreation(dateOfCreation);
    }

    private void saveInputData() {
        view.inputName();
        name = validation.validation(Validation.REG_NAME_OR_SURNAME_OR_PATRONYMIC);
        view.inputSurname();
        surname = validation.validation(Validation.REG_NAME_OR_SURNAME_OR_PATRONYMIC);
        view.inputPatronymic();
        patronymic = validation.validation(Validation.REG_NAME_OR_SURNAME_OR_PATRONYMIC);
        view.inputNickname();
        nickname = validation.validation(Validation.REG_NICKNAME);
        StringBuilder shortForm = new StringBuilder();
        shortForm(shortForm);
        presentationFormOfPerson= shortForm.toString();
        view.inputComment();
        comment = validation.validation(Validation.REG_COMMENT);
        view.inputHomePhone();
        homePhone = validation.validation(Validation.REG_HOME_NUMBER);
        view.inputFirstMobilePhone();
        firstMobilePhone = validation.validation(Validation.REG_FIRST_MOBILE_NUMBER);
        view.inputSecondMobilePhone();
        secondMobilePhone = validation.validation(Validation.REG_SECOND_MOBILE_NUMBER);
        view.inputEmail();
        email = validation.validation(Validation.REG_EMAIL);
        view.inputSkype();
        skype = validation.validation(Validation.REG_SKYPE);
        view.inputIndex();
        indexOfResidence = validation.validation(Validation.REG_INDEX_OF_RESIDENCE);
        view.inputTown();
        town = validation.validation(Validation.REG_TOWN);
        view.inputStreet();
        street = validation.validation(Validation.REG_STREET);
        view.inputHouseNumber();
        houseNumber = validation.validation(Validation.REG_HOUSE_NUMBER);
        view.inputApartmentNumber();
        apartmentNumber = validation.validation(Validation.REG_APARTMENT_NUMBER);
        StringBuilder fullAdress = new StringBuilder();
        fullAdress(fullAdress);
        adress = fullAdress.toString();
        saveDateOfCreationOrDateofChange();
    }

    private void fullAdress(StringBuilder fullAdress) {
        fullAdress.append(indexOfResidence)
                .append(COMA)
                .append(SPACE)
                .append(street)
                .append(COMA)
                .append(SPACE)
                .append(houseNumber)
                .append(COMA)
                .append(SPACE)
                .append(apartmentNumber);
    }

    private void shortForm(StringBuilder shortForm) {
        char firstLetterOFName = name.charAt(0);
        shortForm.append(surname)
                .append(SPACE)
                .append(firstLetterOFName)
                .append(POINT);
    }

    public void saveDateOfCreationOrDateofChange() {
        Date date = new Date();
        String pattern = FOR_USING_DATE_PATTERN;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        dateOfCreation = simpleDateFormat.format(date);
    }

}
