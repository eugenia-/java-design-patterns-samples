package com.company.designpatternsexamples.structural.bridge.example1;

/**
 * @author eugenia
 */
class Pentagon extends Shape {

    Pentagon(Color c) {
        super(c);
    }

    @Override
    public void applyColor() {
        System.out.print("Pentagon filled with color ");
        color.applyColor();
    }
}
