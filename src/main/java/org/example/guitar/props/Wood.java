package org.example.guitar.props;

public enum Wood {
    INDIAN_ROSEWOOD("IndianRosewood"), BRAZILIAN_ROSEWOOD("BarazilianRosewood"), MAHOGANY("Mahogany"),
    MAPLE("Maple"), COCOBOLO("Cocobolo"), CEDAR("Cedar"), ADIRONDACK("Adirondack"), ALDER("Alder"), SITKA("Sitka"),
    ANY("Any");

    private final String wood;

    Wood(String wood) {
        this.wood = wood;
    }

    public String toString() {
        return wood;
    }

    public boolean isEqual(Wood other) {
        if (this.equals(Wood.ANY)) return true;
        if (other.equals(Wood.ANY)) return true;
        return this.equals(other);
    }
}
