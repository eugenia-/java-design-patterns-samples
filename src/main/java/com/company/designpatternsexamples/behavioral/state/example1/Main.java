package com.company.designpatternsexamples.behavioral.state.example1;

import com.company.designpatternsexamples.behavioral.state.example1.context.TVContext;
import com.company.designpatternsexamples.behavioral.state.example1.state.State;
import com.company.designpatternsexamples.behavioral.state.example1.state.TVStartState;
import com.company.designpatternsexamples.behavioral.state.example1.state.TVStopState;

/**
 * @author eugenia
 */
public class Main {

    public static void main(String args[]) {
        TVContext context = new TVContext();

        State tvStartState = new TVStartState();
        State tvStopState = new TVStopState();

        context.setState(tvStartState);
        context.doAction();

        context.setState(tvStopState);
        context.doAction();
    }
}
