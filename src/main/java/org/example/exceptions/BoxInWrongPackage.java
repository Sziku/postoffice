package org.example.exceptions;

public class BoxInWrongPackage extends RuntimeException{
    public BoxInWrongPackage(String message) {
        super(message);
    }
}
