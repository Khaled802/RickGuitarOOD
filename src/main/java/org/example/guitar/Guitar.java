package org.example.guitar;

import org.example.guitar.props.Builder;
import org.example.guitar.props.Type;
import org.example.guitar.props.Wood;

public class Guitar {
    private final String serial_number, model;
    Builder builder;
    Type type;
    Wood backWood, topWood;
    private double price;

    public Guitar(String serial_number, Builder builder, String model, Type type, Wood backWood, Wood topWood, double price) {
        this.serial_number = serial_number;
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
        this.price = price;
    }

    public String getSerial_number() {
        return serial_number;
    }

    public Builder getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
