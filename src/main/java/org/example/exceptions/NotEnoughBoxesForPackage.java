package org.example.exceptions;

public class NotEnoughBoxesForPackage extends RuntimeException{
    public NotEnoughBoxesForPackage(String message) {
        super(message);
    }
}
