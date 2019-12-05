package com.chortke.financialAdvisor.exception;

/**
 * @Author: Mobina Pak
 * @Date: 11/14/2019
 **/
public class BaseServerRuntimeException extends RuntimeException {

    public BaseServerRuntimeException() {
    }

    public BaseServerRuntimeException(String message) {
        super(message);
    }

    public BaseServerRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public BaseServerRuntimeException(Throwable cause) {
        super(cause);
    }

    public BaseServerRuntimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
