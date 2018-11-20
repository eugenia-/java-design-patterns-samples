package com.company.designpatternsexamples.structural.decorator.example3;

/**
 * @author eugenia
 */
 class NonVegFood extends FoodDecorator {

    public NonVegFood(Food newFood) {
        super(newFood);
    }

    public String prepareFood() {
        return super.prepareFood() + " With Roasted Chiken and Chiken Curry  ";
    }

    public double foodPrice() {
        return super.foodPrice() + 150.0;
    }
}
