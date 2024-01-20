package org.example.guitar;

import java.util.List;

public class Inventory {
    private List<Guitar> guitars;

    public Inventory(List<Guitar> guitars) {
        this.guitars = guitars.stream().toList();
    }

    public void addGuitar(Guitar guitar) {
        guitars.add(guitar);
    }

    public void removeGuitar(Guitar guitar) {
        guitars.remove(guitar);
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
