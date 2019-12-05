package com.chortke.financialAdvisor.enums;

/**
 * @Author: Mobina Pak
 * @Date: 14/11/2019
 **/
public enum CustomerType {

    REAL ("REAL"),
    LEGAL("LEGAL");

    private final String value;

    private CustomerType(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }

}
