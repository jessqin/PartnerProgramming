package com.company;

/**
 * Created by Jessica on 10/19/2016.
 */
public class Food
{
    public int price;
    public String flavor;

    public Food(String strFlavor, int intPrice)
    {
        price = intPrice;
        flavor = strFlavor;
    }

    public void setPrice(int intPrice)
    {
        price = intPrice;
    }

    public int getPrice()
    {
        return price;
    }

    public void setFlavor(String strFlavor)
    {
        flavor = strFlavor;
    }

    public String getFlavor()
    {
        return flavor;
    }
}
