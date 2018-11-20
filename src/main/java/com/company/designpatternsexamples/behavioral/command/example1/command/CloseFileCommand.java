package com.company.designpatternsexamples.behavioral.command.example1.command;

import com.company.designpatternsexamples.behavioral.command.example1.reciever.FileSystemReceiver;

/**
 * @author eugenia
 */
public class CloseFileCommand implements Command {

    private FileSystemReceiver fileSystem;

    public CloseFileCommand(FileSystemReceiver fs) {
        this.fileSystem = fs;
    }

    @Override
    public void execute() {
        this.fileSystem.closeFile();
    }
}
