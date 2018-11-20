package com.company.designpatternsexamples.behavioral.state.example2.context;

import com.company.designpatternsexamples.behavioral.state.example2.state.State;

/**
 * Context that also implements {@link State} and keep a reference of its current state
 * and forwards the request to the state implementation
 *
 * @author eugenia
 */
public class Context {

    private State state;

    public Context() {
        state = null;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
