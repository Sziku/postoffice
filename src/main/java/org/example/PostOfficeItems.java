package org.example;

import java.time.LocalDate;

public abstract class PostOfficeItems {
    private String address;
    private String senderName;
    private LocalDate postedDate;
    private double price;

    public PostOfficeItems(String address, String senderName, LocalDate postedDate) {
        this.address = address;
        this.senderName = senderName;
        this.postedDate = postedDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public LocalDate getPostedDate() {
        return postedDate;
    }

    public void setPostedDate(LocalDate postedDate) {
        this.postedDate = postedDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
