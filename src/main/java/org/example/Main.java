package org.example;



import org.example.models.*;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Normal", 2, "Wrap");
        hamburger.addHamburgerAddition1("Tomato", 2);
        hamburger.addHamburgerAddition2("Lettuce", 2);
        hamburger.addHamburgerAddition3("Cheese", 2);
        hamburger.itemizeHamburger();


        HealthyBurger healthyBurger = new HealthyBurger("Vegan Burger", 10, "Sandwich");
        healthyBurger.addHamburgerAddition1("Egg", 1);
        healthyBurger.addHealthyAddition1("Lentils", 2);
        healthyBurger.itemizeHamburger();


        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition3("Should not do this", 50.53);
        db.itemizeHamburger();

    }
}