package org.example.guitar;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Inventory {
    private final List<Guitar> guitars;

    public Inventory(List<Guitar> guitars) {
        this.guitars = guitars.stream().toList();
    }
    public Inventory() {
        this.guitars = new ArrayList<>();
    }

    public void addGuitar(String serialNumber, double price, GuitarSpecs guitarSpecs) {
        Guitar guitar = new Guitar(serialNumber, price, guitarSpecs);
        guitars.add(guitar);
    }

    public Optional<Guitar> getGuitar(String serialNumber) {
        //  ---- > functional < ------ //
        return guitars.stream().filter(guitar -> guitar.getSerial_number().equals(serialNumber)).findFirst();

        //  ---- > imperative < ------ //
//        for (Guitar guitar : guitars) {
//            if (guitar.getSerial_number().equals(serialNumber)) {
//                return Optional.of(guitar);
//            }
//        }
//        return Optional.empty();
    }


    public List<Guitar> search(GuitarSpecs searchGuitar) {
        //  ---- > functional < ------ //
        return guitars.stream().filter(guitar -> guitar.getGuitarSpecs().equals(searchGuitar)).toList();

        //  ---- > imperative < ------ //
//        List<Guitar> matches = new ArrayList<>();
//
//        for (Guitar guitar : guitars) {
//            if (guitar.getGuitarSpecs().equals(searchGuitar))
//                matches.add(guitar);
//        }
//        return matches;
    }
}
