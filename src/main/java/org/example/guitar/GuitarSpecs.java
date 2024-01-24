package org.example.guitar;

import org.example.guitar.props.Builder;
import org.example.guitar.props.Type;
import org.example.guitar.props.Wood;

public record GuitarSpecs(Builder builder, Type type, String model, Wood backWood, Wood topWood) {
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof GuitarSpecs other)) return false;
        if (!builder.isEqual(other.builder))
            return false;
        if (!type.isEqual(other.type))
            return false;
        if (other.model != null && !other.model.isEmpty() && !model.equals(other.model))
            return false;
        if (!backWood.isEqual(other.backWood))
            return false;
        if (!topWood.isEqual(other.topWood))
            return false;
        return true;
    }
}