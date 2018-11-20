package com.company.designpatternsexamples.behavioral.strategy.example1;

/**
 * @author eugenia
 */
class Item {

    private String upcCode;
    private int price;

    Item(String upc, int cost) {
        this.upcCode = upc;
        this.price = cost;
    }

    public String getUpcCode() {
        return upcCode;
    }

    public int getPrice() {
        return price;
    }
}
