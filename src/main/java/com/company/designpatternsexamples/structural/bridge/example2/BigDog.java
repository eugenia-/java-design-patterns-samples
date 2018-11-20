package com.company.designpatternsexamples.structural.bridge.example2;

/**
 * @author eugenia
 */
class BigDog implements FeedingAPI {

    public void feed(int timesADay, int amount, String typeOfFood) {
        System.out.println("Feeding a big dog, " + timesADay + " times a day with " + amount + " g of " + typeOfFood);
    }
}
