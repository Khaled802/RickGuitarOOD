package org.example;

import org.example.guitar.Guitar;
import org.example.guitar.Inventory;
import org.example.guitar.props.Type;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(Type.ELECTRIC.isEqual(Type.ELECTRIC));
        System.out.println(Type.ELECTRIC.isEqual(Type.ACOUSTIC));
        System.out.println(Type.ACOUSTIC.isEqual(Type.ELECTRIC));
        System.out.println(Type.ANY.isEqual(Type.ACOUSTIC));
        System.out.println(Type.ELECTRIC.isEqual(Type.ANY));
    }
}