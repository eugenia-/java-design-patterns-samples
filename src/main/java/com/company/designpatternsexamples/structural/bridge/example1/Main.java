package com.company.designpatternsexamples.structural.bridge.example1;

/**
 * @author eugenia
 */
public class Main {

    public static void main(String[] args) {
        Shape tri = new Triangle(new RedColor());
        Shape pent = new Pentagon(new GreenColor());

        tri.applyColor();
        pent.applyColor();
    }
}
