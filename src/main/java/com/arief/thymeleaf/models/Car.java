package com.arief.thymeleaf.models;

public class Car {
    private String carName;
    private String type;


    public Car(){}
    public Car(String cN , String ty){
        carName = cN;
        type = ty;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
