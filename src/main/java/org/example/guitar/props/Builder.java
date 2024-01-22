package org.example.guitar.props;

public enum Builder {
    FENDER("Fender"), MARTIN("Martin"), GIBSON("Gibson"), COLLINGS("Collings"), OLSON("Olson"), RYAN("Ryan"), PRS("Prs"), ANY("Any");

    private final String builder;

    Builder(String builder) {
        this.builder = builder;
    }

    public String toString() {
        return builder;
    }

    public boolean isEqual(Builder other) {
        if(this.equals(Builder.ANY)) return true;
        if(other.equals(Builder.ANY)) return true;
        return this.equals(other);
    }
}
