package com.company.designpatternsexamples.structural.proxy.example1;

/**
 * Interface for the original and proxy class
 *
 * @author eugenia
 */
interface CommandExecutor {

    void runCommand(String cmd) throws Exception;
}
