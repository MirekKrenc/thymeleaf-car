package com.example.mk.thymeleafhello;

public class Car {

    private String model;
    private String mark;

    public String getModel() {
        return model;
    }

    public String getMark() {
        return mark;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public Car(String model, String mark) {
        this.model = model;
        this.mark = mark;
    }

    public Car() {
    }
}
