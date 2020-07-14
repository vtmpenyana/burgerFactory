package com.vincentmpenyana;

public class Main {

    public static void main(String[] args) {
        Hamburger cheesy = new Hamburger("White", "Beef", 19.99,
                new Addition("Cheese", 2.30),
                new Addition("Jalapeno", 3.33),
                new Addition("test", 5.0));
        System.out.println("Your burger will cost: R" + cheesy.getGrandTotal());
        System.out.println(cheesy.getBasePrice());


        //HB

        Hamburger healthB = new HealthyBurger("Chicken", 25,
                new Addition("White cheese", 9),
                new Addition("Avocado", 7),
                new Addition("Avocado", 7),
                new Addition("Avocado", 7),
                new Addition("Avocado", 7),
                new Addition("Avocado", 7));

        System.out.println("HB will cost: R" + healthB.getGrandTotal());

        //DB

        Hamburger deluxe = new Deluxe("White", "Beef", 30.50);
        System.out.println(deluxe.getMeat());
        System.out.println(deluxe.getGrandTotal());

    }
}
