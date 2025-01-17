package org.example.models;


public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;



    public HealthyBurger(String name, double price, String breadRollType) {
        super(name, "Tofu", price, breadRollType);
    }

    public String getHealthyExtra1Name() {
        return healthyExtra1Name;
    }

    public double getHealthyExtra1Price() {
        return healthyExtra1Price;
    }

    public String getHealthyExtra2Name() {
        return healthyExtra2Name;
    }

    public double getHealthyExtra2Price() {
        return healthyExtra2Price;
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    public double itemizeHamburger() {
        double totalHamburgerCost = super.getPrice();
        System.out.println("------ ***   HEALTHY HAMBURGER INSTANCE  *** ------");
        System.out.println(getClass().getSimpleName() + "'s");

        System.out.println("Name: " + getName() + "\n" +
                "Meat type: " + getMeat() + "\n" +
                "Price: $" + getPrice() + "\n"
        );

        if (healthyExtra1Name != null) {
            totalHamburgerCost += healthyExtra1Price;
            System.out.println("Added extra topping: " + getHealthyExtra1Name() + " $(" + getHealthyExtra1Price() + ")");
        }
        if (healthyExtra2Name != null) {
            totalHamburgerCost += healthyExtra2Price;
            System.out.println("Added extra topping: " + getHealthyExtra2Name() + " $(" + getHealthyExtra2Price() + ")");
        }

        System.out.println("Grand total: $" + totalHamburgerCost);
        System.out.println();
        setPrice(totalHamburgerCost);
        return totalHamburgerCost;

    }

}