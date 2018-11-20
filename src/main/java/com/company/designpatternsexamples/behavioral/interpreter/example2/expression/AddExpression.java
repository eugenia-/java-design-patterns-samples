package com.company.designpatternsexamples.behavioral.interpreter.example2.expression;

import com.company.designpatternsexamples.behavioral.interpreter.example2.InterpreterEngine;

/**
 * @author eugenia
 */
public class AddExpression implements Expression {

    private String expression;

    public AddExpression(String expression) {
        this.expression = expression;
    }

    @Override
    public int interpret(InterpreterEngine engine) {
        return engine.add(expression);
    }
}
