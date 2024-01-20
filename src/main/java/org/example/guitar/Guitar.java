package org.example.guitar;

public class Guitar {
    private String serial_number, builder, model, type, backWood, topWood;
    private double price;

    public Guitar(String serial_number, String builder, String model, String type, String backWood, String topWood, double price) {
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

    public String getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public String getBackWood() {
        return backWood;
    }

    public String getTopWood() {
        return topWood;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
