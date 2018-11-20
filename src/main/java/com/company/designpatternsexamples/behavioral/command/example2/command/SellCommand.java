package com.company.designpatternsexamples.behavioral.command.example2.command;

import com.company.designpatternsexamples.behavioral.command.example2.reciever.Application;

/**
 * @author eugenia
 */
public class SellCommand implements Order {

    private Application application;

    public SellCommand(Application application) {
        this.application = application;
    }

    @Override
    public void placeOrder() {
        application.sell();
    }
}
