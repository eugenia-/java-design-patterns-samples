package com.company.designpatternsexamples.behavioral.templatemethod.example2.employee;

/**
 * @author eugenia
 */
public class Programmer extends Employee {

    @Override
    public void work() {
        System.out.println("Writing code.");
    }

    @Override
    public void takePause() {
        System.out.println("Taking a small break from writing code.");
    }

    @Override
    public void getPaid() {
        System.out.println("Getting paid for developing the project.");
    }
}
