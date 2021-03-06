package com.company.designpatternsexamples.behavioral.strategy.example2;

/**
 * @author eugenia
 */
class Mall implements Strategy {

    @Override
    public String build(String location) {
        return "Building a mall in the " + location + " area.";
    }
}
