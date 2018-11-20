package com.company.designpatternsexamples.structural.composite.example1;

/**
 * @author eugenia
 */
class Circle implements Shape {

    public void draw(String fillColor) {
        System.out.println("Drawing Circle with color " + fillColor);
    }
}
