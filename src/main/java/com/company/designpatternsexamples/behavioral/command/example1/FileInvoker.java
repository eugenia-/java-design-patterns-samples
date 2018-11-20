package com.company.designpatternsexamples.behavioral.command.example1;

import com.company.designpatternsexamples.behavioral.command.example1.command.Command;

/**
 * Class that encapsulates the Command and passes the request to the command object to process it
 *
 * @author eugenia
 */
class FileInvoker {

    public Command command;

    public FileInvoker(Command c) {
        this.command = c;
    }

    public void execute() {
        this.command.execute();
    }
}
