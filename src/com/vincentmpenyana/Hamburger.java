package com.vincentmpenyana;

public class Hamburger {
    private String breadRollType;
    private String meat;
    private double basePrice;
    private Addition addition1;
    private Addition addition2;
    private Addition addition3;
    private Addition addition4;

    public Hamburger(String breadRollType, String meat, double basePrice) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.basePrice = basePrice;
    }

    public Hamburger(String breadRollType, String meat, double basePrice, Addition item1) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.basePrice = basePrice;
        this.addition1 = item1;
    }

    public Hamburger(String breadRollType, String meat, double basePrice, Addition addition1, Addition addition2) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.basePrice = basePrice;
        this.addition1 = addition1;
        this.addition2 = addition2;
    }

    public Hamburger(String breadRollType, String meat, double basePrice, Addition item1, Addition item2, Addition item3) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.basePrice = basePrice;
        this.addition1 = item1;
        this.addition2 = item2;
        this.addition3 = item3;
    }

    public Hamburger(String breadRollType, String meat, double basePrice, Addition item1, Addition item2, Addition item3, Addition item4) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.basePrice = basePrice;
        this.addition1 = item1;
        this.addition2 = item2;
        this.addition3 = item3;
        this.addition4 = item4;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public Addition getAddition1() {
        return addition1;
    }

    public Addition getAddition2() {
        return addition2;
    }

    public Addition getAddition3() {
        return addition3;
    }

    public Addition getItem4() {
        return addition4;
    }

    public double getGrandTotal(){
        double grandTotal = this.basePrice;
        if(this.addition1 != null){
            System.out.println(addition1.getName() + " was added for: R" + addition1.getPrice());
            grandTotal += addition1.getPrice();
        }

        if(this.addition2 != null){
            System.out.println(addition2.getName() + " was added for: R" + addition2.getPrice());
            grandTotal += addition2.getPrice();
        }
        if(this.addition3 != null){
            System.out.println(addition3.getName() + " was added for: R" + addition3.getPrice());
            grandTotal += addition3.getPrice();
        }
        if(this.addition4 != null){
            System.out.println(addition4.getName() + " was added for: R" + addition4.getPrice());
            grandTotal += addition4.getPrice();
        }

        return grandTotal;
    }
}
