package com.chortke.financialAdvisor.exception;

/**
 * @Author: Mobina Pak
 * @Date: 14/11/2019
 **/
public class BaseServerException extends Exception {

    public BaseServerException() {
    }

    public BaseServerException(String message) {
        super(message);
    }

    public BaseServerException(String message, Throwable cause) {
        super(message, cause);
    }

    public BaseServerException(Throwable cause) {
        super(cause);
    }

    public BaseServerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
