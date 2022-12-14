package com.ProjectwithFood.Person;

import com.ProjectwithFood.Product.Food;

public class Producent extends Person implements ProducingMan {

    public Producent(String name, String surname) {
        super(name, surname);
    }

    @Override
    public void consume(Food food) {

    }

    @Override
    public Food produce(String productName, ConsumingMan consumingMan) {
        return null;
    }
}
