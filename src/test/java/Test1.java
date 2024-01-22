import org.example.guitar.Guitar;
import org.example.guitar.GuitarSpecs;
import org.example.guitar.Inventory;
import org.example.guitar.props.Builder;
import org.example.guitar.props.Type;
import org.example.guitar.props.Wood;

import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);
        GuitarSpecs whatErinLikes = new GuitarSpecs(Builder.FENDER, Type.ELECTRIC,"Stratocastor",
                 Wood.ALDER, Wood.ALDER);
        List<Guitar> guitars = inventory.search(whatErinLikes);
        if (!guitars.isEmpty()) {
            System.out.println("Erin, you might like these guitars:");
            for (Guitar guitar : guitars) {
                System.out.println(" We have a " +
                        guitar.getGuitarSpecs().getBuilder() + " " + guitar.getGuitarSpecs().getModel() + " " +
                        guitar.getGuitarSpecs().getType() + " guitar:\n " +
                        guitar.getGuitarSpecs().getBackWood() + " back and sides,\n " +
                        guitar.getGuitarSpecs().getTopWood() + " top.\n You can have it for only $" +
                        guitar.getPrice() + "!\n ----");
            }
        } else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }

    public static void initializeInventory(Inventory inventory) {
        inventory.addGuitar("V95693",
                1499.95, new GuitarSpecs(Builder.FENDER, Type.ELECTRIC, "Stratocastor",
                 Wood.ALDER, Wood.ALDER));
        inventory.addGuitar("V9512", 1549.95,
                new GuitarSpecs(
                        Builder.FENDER, Type.ELECTRIC, "Stratocastor", Wood.ALDER, Wood.ALDER
                )
        );
        inventory.addGuitar("V9512", 1549.95,
                new GuitarSpecs(
                        Builder.COLLINGS, Type.ACOUSTIC, "Stratocastor", Wood.ALDER, Wood.COCOBOLO
                )
        );
    }
}
