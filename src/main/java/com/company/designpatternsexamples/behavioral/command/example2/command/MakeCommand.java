package com.company.designpatternsexamples.behavioral.command.example2.command;

import com.company.designpatternsexamples.behavioral.command.example2.reciever.Application;

/**
 * @author eugenia
 */
public class MakeCommand implements Order {

    private Application application;

    public MakeCommand(Application application) {
        this.application = application;
    }

    @Override
    public void placeOrder() {
        application.make();
    }
}
