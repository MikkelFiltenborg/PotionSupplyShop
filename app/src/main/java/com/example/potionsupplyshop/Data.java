package com.example.potionsupplyshop;

import java.util.ArrayList;
import java.util.List;

public class Data
{
    static List<Wares> ShoppingCart = new ArrayList<> ();
    static List<Wares> AddData()
    {
        List<Wares> inventory = new ArrayList<Wares>();
        Wares w1 = new Wares();
        w1.setName("Batwings");
        w1.setPrice(25);
        w1.setQty(2000);
        w1.setDescr("Common");
        inventory.add(w1);
        inventory.add(new Wares("Tears of Unicorn", 1000, 5, "Very Rare"));
        inventory.add(new Wares("Phoenix Feather", 2000, 2, "Legendary"));

        return inventory;
    }
}
