package com.company.designpatternsexamples.behavioral.memento.example2;

/**
 * Contains a state that will be saved for later use
 *
 * @author eugenia
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
