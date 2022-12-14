package com.AbstractClasses;

public abstract class Animal {

    private String color;

    public Animal(final String color) {
        this.color = color;
    }

    abstract String gimmevoice();
}
