package com.company.designpatternsexamples.behavioral.interpreter.example2.expression;

import com.company.designpatternsexamples.behavioral.interpreter.example2.InterpreterEngine;

/**
 * @author eugenia
 */
public class MultiplyExpression implements Expression {

    private String expression;

    public MultiplyExpression(String expression) {
        this.expression = expression;
    }

    @Override
    public int interpret(InterpreterEngine engine) {
        return engine.multiply(expression);
    }
}
