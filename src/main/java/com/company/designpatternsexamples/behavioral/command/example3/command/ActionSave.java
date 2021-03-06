package com.company.designpatternsexamples.behavioral.command.example3.command;

import com.company.designpatternsexamples.behavioral.command.example3.reciever.Document;

/**
 * Concrete command
 *
 * @author eugenia
 */
public class ActionSave implements ActionListenerCommand {

    private Document doc;

    public ActionSave(Document doc) {
        this.doc = doc;
    }

    @Override
    public void execute() {
        doc.save();
    }
}
