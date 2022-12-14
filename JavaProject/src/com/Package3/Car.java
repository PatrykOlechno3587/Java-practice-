package com.Package3;
public class Car {

    private String company;
    private String model;
    private String color;
    private String[] additionalEquipment;


    public String getCompany() {
        return this.company;
    }

    public String getModel() {
        return this.model;
    }

    public String getColor() {
        return this.color;
    }

    public Car(String company, String model, String color, String... additionalEquipment) {
        this.company = company;
        this.model = model;
        this.color = color;
        this.additionalEquipment = additionalEquipment;
    }



    }



