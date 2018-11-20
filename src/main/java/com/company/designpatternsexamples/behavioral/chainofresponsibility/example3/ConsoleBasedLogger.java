package com.company.designpatternsexamples.behavioral.chainofresponsibility.example3;

/**
 * @author eugenia
 */
class ConsoleBasedLogger extends Logger {

    public ConsoleBasedLogger(int levels) {
        this.levels=levels;
    }
    @Override
    protected void displayLogInfo(String msg) {
        System.out.println("CONSOLE LOGGER INFO: "+msg);
    }
}
