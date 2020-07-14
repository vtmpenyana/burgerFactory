package com.vincentmpenyana;

public class Drink extends Addition {
    private char size;

    public Drink(String name, double price, char size) {
        super(name, price);
        this.size = size;
    }

    public char getSize() {
        return size;
    }
}
