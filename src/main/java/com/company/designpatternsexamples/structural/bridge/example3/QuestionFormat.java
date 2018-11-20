package com.company.designpatternsexamples.structural.bridge.example3;

/**
 * @author eugenia
 */
class QuestionFormat extends QuestionManager {

    QuestionFormat(String catalog, Question q) {
        super(catalog, q);
    }

    public void displayAll() {
        System.out.println("\n---------------------------------------------------------");
        super.displayAll();
        System.out.println("-----------------------------------------------------------");
    }

}
