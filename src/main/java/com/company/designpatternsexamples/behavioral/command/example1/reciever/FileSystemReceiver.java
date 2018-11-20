package com.company.designpatternsexamples.behavioral.command.example1.reciever;

/**
 * Receiver interface which implementations will actually do all the work.
 *
 * @author eugenia
 */
public interface FileSystemReceiver {
    void openFile();

    void writeFile();

    void closeFile();
}
