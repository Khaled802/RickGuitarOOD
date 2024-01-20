package org.example.guitar;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Inventory {
    private List<Guitar> guitars;

    public Inventory(List<Guitar> guitars) {
        this.guitars = guitars.stream().toList();
    }
    public Inventory() {
        this.guitars = new ArrayList<>();
    }

    public void addGuitar(String serialNumber, double price,
                          String builder, String model,
                          String type, String backWood, String topWood) {
        Guitar guitar = new Guitar(serialNumber, builder, model, type, backWood, topWood, price);
        guitars.add(guitar);
    }

    public Optional<Guitar> getGuitar(String serialNumber) {
        return guitars.stream().filter(guitar -> guitar.getSerial_number().equals(serialNumber)).findFirst();
    }


    // not working method
    public Guitar search(Guitar searchGuitar) {
        for (Guitar guitar : guitars) {
            String builder = searchGuitar.getBuilder();
            if ((builder != null) && (!builder.isEmpty()) &&
                    (!builder.equals(guitar.getBuilder())))
                continue;
            String model = searchGuitar.getModel();
            if ((model != null) && (!model.isEmpty()) &&
                    (!model.equals(guitar.getModel())))
                continue;
            String type = searchGuitar.getType();
            if ((type != null) && (!searchGuitar.equals("")) &&
                    (!type.equals(guitar.getType())))
                continue;
            String backWood = searchGuitar.getBackWood();
            if ((backWood != null) && (!backWood.equals("")) &&
                    (!backWood.equals(guitar.getBackWood())))
                continue;
            String topWood = searchGuitar.getTopWood();
            if ((topWood != null) && (!topWood.equals("")) &&
                    (!topWood.equals(guitar.getTopWood())))
                continue;
        }
        return null;
    }
}
