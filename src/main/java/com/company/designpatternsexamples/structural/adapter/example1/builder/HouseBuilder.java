package com.company.designpatternsexamples.structural.adapter.example1.builder;

/**
 * @author eugenia
 */
class HouseBuilder implements Builder {

    public void build(String location) {
        System.out.println("Building a house located in the " + location + "area!");
    }
}
