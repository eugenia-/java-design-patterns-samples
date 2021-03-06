package com.company.designpatternsexamples.behavioral.chainofresponsibility.example3;

/**
 * @author eugenia
 */
class ErrorBasedLogger extends Logger {

    public ErrorBasedLogger(int levels) {
        this.levels = levels;
    }

    @Override
    protected void displayLogInfo(String msg) {
        System.out.println("ERROR LOGGER INFO: " + msg);
    }
}
