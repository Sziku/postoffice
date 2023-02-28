package org.example;

import java.time.LocalDate;

public class Boxes extends PostOfficeItems{

    private boxType type;
    private double weight;


    public Boxes(String address, String senderName, LocalDate postedDate, boxType type, double weight) {
        super(address, senderName, postedDate);
        this.type = type;
        this.weight = weight;
        setPrice(calculatePrice());

    }

    private double calculatePrice() {
        return type.PRICE + type.MULTIPLAYER * weight;
    }

    public boxType getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return type + " box from: " + getSenderName()
                + " to: " + getAddress()
                + " on: " + getPostedDate()
                + " price: " + getPrice();
    }
}
