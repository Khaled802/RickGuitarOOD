import org.example.guitar.Guitar;
import org.example.guitar.Inventory;
import org.example.guitar.props.Builder;
import org.example.guitar.props.Type;
import org.example.guitar.props.Wood;

import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);
        Guitar whatErinLikes = new Guitar("", Builder.FENDER, "Stratocastor",
                Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 0);
        List<Guitar> guitars = inventory.search(whatErinLikes);
        if (!guitars.isEmpty()) {
            System.out.println("Erin, you might like these guitars:");
            for (Guitar guitar : guitars) {
                System.out.println(" We have a " +
                        guitar.getBuilder() + " " + guitar.getModel() + " " +
                        guitar.getType() + " guitar:\n " +
                        guitar.getBackWood() + " back and sides,\n " +
                        guitar.getTopWood() + " top.\n You can have it for only $" +
                        guitar.getPrice() + "!\n ----");
            }
        } else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }

    public static void initializeInventory(Inventory inventory) {
        inventory.addGuitar("V95693",
                1499.95, Builder.FENDER, "Stratocastor",
                Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
        inventory.addGuitar("V9512",
                1549.95, Builder.FENDER,
                "Stratocastor", Type.ELECTRIC,
                Wood.ALDER, Wood.ALDER);
    }
}
