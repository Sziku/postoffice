package org.example;

import java.time.LocalDate;

public class Letters extends PostOfficeItems{

    private final double LETTER_PRICE= 1.99;

    public Letters(String address, String senderName, LocalDate postedDate) {
        super(address, senderName, postedDate);
        setPrice(LETTER_PRICE);
    }

    @Override
    public String toString() {
        return  "Letter from: " + getSenderName()
                + " to: " + getAddress()
                + " on: " + getPostedDate();
    }
}
