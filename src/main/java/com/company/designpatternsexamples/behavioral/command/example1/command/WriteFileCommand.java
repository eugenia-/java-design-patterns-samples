package com.company.designpatternsexamples.behavioral.command.example1.command;

import com.company.designpatternsexamples.behavioral.command.example1.reciever.FileSystemReceiver;

/**
 * @author eugenia
 */
public class WriteFileCommand implements Command {

    private FileSystemReceiver fileSystem;

    public WriteFileCommand(FileSystemReceiver fs) {
        this.fileSystem = fs;
    }

    @Override
    public void execute() {
        this.fileSystem.writeFile();
    }

}
