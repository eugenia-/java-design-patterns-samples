package com.company.designpatternsexamples.structural.proxy.example4;

/**
 * @author eugenia
 */
public class Main {

    public static void main(String[] args) {
        ExpensiveObject object = new ExpensiveObjectProxy();
        object.process();
        object.process();
    }

}
