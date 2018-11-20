package com.company.designpatternsexamples.structural.decorator.example3;

/**
 * @author eugenia
 */
class VegFood implements Food {

    public String prepareFood() {
        return "Veg Food";
    }

    public double foodPrice() {
        return 50.0;
    }
}
