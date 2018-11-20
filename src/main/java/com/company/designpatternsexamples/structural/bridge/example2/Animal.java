package com.company.designpatternsexamples.structural.bridge.example2;

/**
 * @author eugenia
 */
abstract class Animal {
    protected FeedingAPI feedingAPI;

    protected Animal(FeedingAPI feedingAPI) {
        this.feedingAPI = feedingAPI;
    }

    public abstract void feed();
}
