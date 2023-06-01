package com.wiley.springBootNew.exception;

public class DepNotFoundException extends Exception {
    public DepNotFoundException() {
        super();
    }

    public DepNotFoundException(String message) {
        super(message);
    }

    public DepNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public DepNotFoundException(Throwable cause) {
        super(cause);
    }

    public DepNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
}
}

