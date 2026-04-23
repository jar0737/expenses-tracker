package com.jaro.expense_tracker.exceptions;

//thrown when the request data is invalid or breaks rules (returns 400).

public class BadRequestException extends RuntimeException {
    public BadRequestException(String message){
        super(message);
    }
}
