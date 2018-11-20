package com.company.designpatternsexamples.behavioral.state.example2.state;

import com.company.designpatternsexamples.behavioral.state.example2.context.Context;

/**
 * Concrete State Implementation
 *
 * @author eugenia
 */
public class ApplicationFinish implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("The application is in the finished state of development.");
        context.setState(this);
    }

    public String toString() {
        return "Finished state.";
    }
}
