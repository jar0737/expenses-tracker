package com.jaro.expense_tracker.exceptions;

//Thrown when a requested resource is not found (HTTP 404).

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String message){
        super(message);
    }
}
