package com.company.designpatternsexamples.structural.bridge.example1;

/**
 * @author eugenia
 */
class Triangle extends Shape {

    Triangle(Color c) {
        super(c);
    }

    @Override
    public void applyColor() {
        System.out.print("Triangle filled with color ");
        color.applyColor();
    }
}
