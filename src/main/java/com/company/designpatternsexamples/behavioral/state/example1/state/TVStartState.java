package com.company.designpatternsexamples.behavioral.state.example1.state;

/**
 * Concrete State Implementation
 *
 * @author eugenia
 */
public class TVStartState implements State {

    @Override
    public void doAction() {
        System.out.println("TV is turned ON");
    }
}
