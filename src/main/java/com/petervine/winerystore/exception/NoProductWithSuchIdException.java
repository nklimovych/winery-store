package com.petervine.winerystore.exception;

public class NoProductWithSuchIdException extends Exception {
    public NoProductWithSuchIdException(String message) {
        super(message);
    }
}
