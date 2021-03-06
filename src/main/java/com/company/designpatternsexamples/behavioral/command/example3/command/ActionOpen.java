package com.company.designpatternsexamples.behavioral.command.example3.command;

import com.company.designpatternsexamples.behavioral.command.example3.reciever.Document;

/**
 * Concrete command
 *
 * @author eugenia
 */
public class ActionOpen implements ActionListenerCommand {

    private Document doc;

    public ActionOpen(Document doc) {
        this.doc = doc;
    }

    @Override
    public void execute() {
        doc.open();
    }
}
