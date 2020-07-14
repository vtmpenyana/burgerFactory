package com.vincentmpenyana;

public class HealthyBurger extends Hamburger {
    private Addition addition5;
    private Addition addition6;

    public HealthyBurger(String meat, double basePrice) {
        super("Brown bread", meat, basePrice);
    }

    public HealthyBurger(String meat, double basePrice, Addition item1, Addition item2, Addition item3, Addition item4, Addition addition5, Addition addition6) {
        super("Brown bread", meat, basePrice, item1, item2, item3, item4);
        this.addition5 = addition5;
        this.addition6 = addition6;
    }

    public HealthyBurger(String breadRollType, String meat, double basePrice, Addition item1, Addition item2, Addition item3, Addition item4, Addition addition5) {
        super(breadRollType, meat, basePrice, item1, item2, item3, item4);
        this.addition5 = addition5;
    }

    public HealthyBurger(String meat, double basePrice, Addition item1, Addition item2, Addition item3, Addition item4) {
        super("Brown bread", meat, basePrice, item1, item2, item3, item4);
    }

    public HealthyBurger(String meat, double basePrice, Addition addition1, Addition addition2) {
        super("Brown bread", meat, basePrice, addition1, addition2);
    }

    public HealthyBurger(String meat, double basePrice, Addition item1, Addition item2, Addition item3) {
        super("Brown bread", meat, basePrice, item1, item2, item3);
    }

    public HealthyBurger(String meat, double basePrice, Addition item1) {
        super("Brown bread", meat, basePrice, item1);
    }


    public Addition getAddition5() {
        return addition5;
    }

    public Addition getAddition6() {
        return addition6;
    }

    @Override
    public double getGrandTotal() {
        double grandTotal = super.getGrandTotal();
        if (addition5 != null) {
            System.out.println(addition5.getName() + "was added for: R" + addition5.getPrice());
            grandTotal += addition5.getPrice();
        }

        if (addition6 != null) {
            System.out.println(addition6.getName() + "was added for: R" + addition6.getPrice());
            grandTotal += addition6.getPrice();
        }

        return grandTotal;
    }
}
