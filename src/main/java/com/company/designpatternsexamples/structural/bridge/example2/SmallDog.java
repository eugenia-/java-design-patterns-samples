package com.company.designpatternsexamples.structural.bridge.example2;

/**
 * @author eugenia
 */
class SmallDog implements FeedingAPI {

    public void feed(int timesADay, int amount, String typeOfFood) {
        System.out.println("Feeding a small dog, " + timesADay + " times a day with " +
                amount + " g of " + typeOfFood);
    }
}
