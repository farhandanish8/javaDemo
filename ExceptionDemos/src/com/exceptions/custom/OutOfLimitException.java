package com.exceptions.custom;

public class OutOfLimitException extends Exception {
    public OutOfLimitException(){

    }

    public OutOfLimitException(String message) {
        super(message);
    }
}
