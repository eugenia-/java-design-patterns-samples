package com.company.designpatternsexamples.behavioral.strategy.example2;

/**
 * @author eugenia
 */
class Skyscraper implements Strategy {

    @Override
    public String build(String location) {
        return "Building a skyscraper in the " + location + " area.";
    }
}
