package com.thinking.OOAD.rick.app;

import com.thinking.OOAD.rick.model.*;
import com.thinking.OOAD.rick.service.Inventory;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Alan on 2016-11-28.
 *
 * 测试驱动
 */
public class FindGuitarTester {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);
        GuitarSpec whatErinLikes = new GuitarSpec( Builder.FENDER,"stratocastor", Type.ELECTRIC, Wood.ALDER,Wood.ALDER, 6);
        List<Guitar> matchingGuitars = inventory.search(whatErinLikes);
        if(!matchingGuitars.isEmpty()) {

            for (Iterator i = matchingGuitars.iterator(); i.hasNext() ;) {
                Guitar guitar = (Guitar) i.next();
                System.out.println("Erin,your might like this " +
                        guitar.getSpec().getBuilder() + " " + guitar.getSpec().getModel() + " " +
                        guitar.getSpec().getType() + "guitar:\n  " +
                        guitar.getSpec().getBackWood() + "back and sides,\n  " +
                        guitar.getSpec().getTopWood() + "top.\nYou can have it for only $" +
                        guitar.getPrice() + "!\n  ----------");
            }

        }else {
            System.out.println("Sorry,Erin,We have nothing for you. ");
        }
    }

    private static void initializeInventory(Inventory inventory) {
        inventory.addGuitar("V95693",1499.95,new GuitarSpec(Builder.FENDER,"Stratocastor",Type.ELECTRIC,Wood.ALDER,Wood.ALDER, 6));
        inventory.addGuitar("V9512",1549.95,new GuitarSpec(Builder.FENDER,"Stratocastor",Type.ELECTRIC,Wood.ALDER,Wood.ALDER, 12));
    }
}
