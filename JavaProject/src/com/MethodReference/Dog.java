package com.MethodReference;

public class Dog {

    private final String name;

    public Dog(String name) {
        this.name = name;
    }

    public String dajName() {
        return name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
