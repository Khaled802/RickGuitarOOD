package org.example.guitar.props;

public enum Type {
    ACOUSTIC("Acoustic"), ELECTRIC("Electric"), ANY("Any");

    private final String type;

    Type(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
    public String toString() {
        return name().toLowerCase();
    }

    public boolean isEqual(Type other) {
        if (other == this) return true;
        if (this.equals(Type.ANY) || other.equals(Type.ANY)) return true;
        return type.equals(other.type);
    }
}
