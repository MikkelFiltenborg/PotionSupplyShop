package com.example.potionsupplyshop;

import android.app.Activity;

public class Wares
{
    private String Name;
    private double Price;
    private int Qty;
    private String Descr;

    public Wares()
    {
    }

    public Wares(String name, double price, int qty, String descr)
    {
        Name = name;
        Price = price;
        Qty = qty;
        Descr = descr;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public double getPrice() {
        return Price;
    }

    public void setQty(int qty) {
        Qty = qty;
    }

    public int getQty() {
        return Qty;
    }

    public void setDescr(String descr) {
        Descr = descr;
    }

    public String getDescr() {
        return Descr;
    }
}
