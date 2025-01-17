package org.example.models;

public class DeluxeBurger extends Hamburger {
    private String cips;
    private String drink;

    public DeluxeBurger() {
        super("Deluxe", "Dana", 19.10, "Beyaz");
        this.cips = "CURVY";
        this.drink = "COKE";
    }

    public String getCips() {
        return cips;
    }

    public String getDrink() {
        return drink;
    }

    public void printDeluxeWarning() {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        printDeluxeWarning();
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        printDeluxeWarning();
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        printDeluxeWarning();
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        printDeluxeWarning();
    }

    public double itemizeHamburger() {
        double hamburgerPrice = getPrice();
        System.out.println("------ ***   DELUXE HAMBURGER INSTANCE  ***-------");
        System.out.println(getClass().getSimpleName() + "'s");

        System.out.println("Name: " + getName() + "\n" +
                "Meat type: " + getMeat() + "\n" +
                "Price: " + getPrice()
        );

        System.out.println("Grand total: $" + hamburgerPrice);
        System.out.println();
        return hamburgerPrice;

    }
}