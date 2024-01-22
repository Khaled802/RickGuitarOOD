package org.example.guitar;

import org.example.guitar.props.Builder;
import org.example.guitar.props.Type;
import org.example.guitar.props.Wood;

public class GuitarSpecs {
    private Builder builder;
    private Type type;
    private String model;
    private Wood backWood;
    private Wood topWood;

    public GuitarSpecs(Builder builder, Type type, String model, Wood backWood, Wood topWood) {
        this.builder = builder;
        this.type = type;
        this.model = model;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public Builder getBuilder() {
        return builder;
    }

    public Type getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }
}