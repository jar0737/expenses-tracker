package com.jaro.expense_tracker.exceptions;

//thrown when you try to create something that already exists (returns 409).

public class DuplicateResourceException extends RuntimeException{
    public DuplicateResourceException(String message){
        super(message);
    }
}
