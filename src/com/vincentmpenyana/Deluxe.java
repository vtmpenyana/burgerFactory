package com.vincentmpenyana;

public class Deluxe extends Hamburger {
    public Deluxe(String breadRollType, String meat, double basePrice) {
        super(breadRollType, meat, basePrice, new Addition("Coke", 0), new Addition("Chips", 0));
    }
}
