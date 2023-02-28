package org.example.exceptions;

public class PackageIsToHeavy extends RuntimeException {
    public PackageIsToHeavy(String message) {
        super(message);
    }
}
