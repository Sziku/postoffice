package org.example;

public enum boxType {
    SMALL(7.99,0.1), BIG(10.29, 0.29);

    final double PRICE;
    final double MULTIPLAYER;

    boxType(double PRICE, double MULTIPLAYER) {
        this.PRICE = PRICE;
        this.MULTIPLAYER = MULTIPLAYER;
    }

    public double getPRICE() {
        return PRICE;
    }

    public double getMULTIPLAYER() {
        return MULTIPLAYER;
    }
}

