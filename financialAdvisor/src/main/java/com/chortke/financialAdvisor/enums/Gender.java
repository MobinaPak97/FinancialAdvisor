package com.chortke.financialAdvisor.enums;

/**
 * @Author: Mobina Pak
 * @Date: 14/11/2019
 **/
public enum Gender {

    FEMALE("female"),
    MALE("male");

    private final String value;

    private Gender(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
