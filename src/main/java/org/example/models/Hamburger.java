package org.example.models;



import java.util.Arrays;
import java.util.Objects;

public class Hamburger implements Addable {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;
    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;




    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public Hamburger() {

    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBreadRollType() {
        return breadRollType;
    }



    public void addHamburgerAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger() {
        double totalHamburgerCost = getPrice();
        System.out.println("------ ***   PARENT HAMBURGER INSTANCE  ***-------");
        System.out.println(getClass().getSimpleName() + "'s");

        System.out.println("Name: " + getName() + "\n" +
                "Meat type: " + getMeat() + "\n" +
                "Price: " + getPrice()
        );

        if (addition1Name != null) {
            totalHamburgerCost += addition1Price;
            System.out.println("Added extra topping: " + addition1Name + " $(" + addition1Price + ")");
        }
        if (addition2Name != null) {
            totalHamburgerCost += addition2Price;
            System.out.println("Added extra topping: " + addition2Name + " $(" + addition2Price + ")");
        }
        if (addition3Name != null) {
            totalHamburgerCost += addition3Price;
            System.out.println("Added extra topping: " + addition3Name + " $(" + addition3Price + ")");
        }
        if (addition4Name != null) {
            totalHamburgerCost += addition4Price;
            System.out.println("Added extra topping: " + addition4Name + " $(" + addition4Price + ")");
        }
        System.out.println("Grand total: $" + totalHamburgerCost);
        System.out.println();
        setPrice(totalHamburgerCost);
        return totalHamburgerCost;

    }

    @Override
    public void addAddition(String name, double price) {

    }
}