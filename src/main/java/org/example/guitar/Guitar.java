package org.example.guitar;

import org.example.guitar.props.Builder;
import org.example.guitar.props.Type;
import org.example.guitar.props.Wood;

public class Guitar {
    private final GuitarSpecs guitarSpecs;
    private final String serial_number;
    private final double price;

    public Guitar(String serial_number, double price, GuitarSpecs guitarSpecs) {
        this.serial_number = serial_number;
        this.guitarSpecs = guitarSpecs;
        this.price = price;
    }

    public String getSerial_number() {
        return serial_number;
    }
    public GuitarSpecs getGuitarSpecs() {
        return guitarSpecs;
    }

    public double getPrice() {
        return price;
    }
}
