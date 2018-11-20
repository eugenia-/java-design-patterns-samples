package com.company.designpatternsexamples.structural.decorator.example1;

/**
 * Component Implementation
 * The basic implementation of the component interface (or abstract class).
 *
 * @author eugenia
 */
class BasicCar implements Car{

    public void assemble() {
        System.out.print("Assembling a basic Car. ");
    }
}
