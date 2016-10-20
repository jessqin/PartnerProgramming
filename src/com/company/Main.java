package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
        Food iceCreamC = new Food("chocolate", 2);
        Food iceCreamV = new Food("vanilla", 4);
        Food iceCreamCD = new Food("cookie dough", 6);
        Food iceCreamM = new Food("mint", 8);

        Scanner keyIn = new Scanner(System.in);
        System.out.println("Please enter a flavor.");
        String fl = keyIn.next();

        if (fl.equalsIgnoreCase(iceCreamC.flavor))
        {
            System.out.println("Price: $" + iceCreamC.getPrice());
        }
        else if (fl.equalsIgnoreCase(iceCreamV.flavor))
        {
            System.out.println("Price: $" + iceCreamV.getPrice());
        }
        else if (fl.equalsIgnoreCase(iceCreamCD.flavor))
        {
            System.out.println("Price: $" + iceCreamCD.getPrice());
        }
        else if (fl.equalsIgnoreCase(iceCreamM.flavor))
        {
            System.out.println("Price: $" + iceCreamM.getPrice());
        }
        else
        {
            System.out.println("The only flavors are chocolate, vanilla, cookie dough, and mint. Please try again");
        }
    }
}
