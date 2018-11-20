package com.company.designpatternsexamples.behavioral.chainofresponsibility.example2;

/**
 * @author eugenia
 */
public class Manager extends Employee {

    public Manager(int authorityLevel) {
        this.authorityLevel = authorityLevel;
    }

    @Override
    protected void write(String message) {
        System.out.println("Manager is working on project: " + message);
    }
}
