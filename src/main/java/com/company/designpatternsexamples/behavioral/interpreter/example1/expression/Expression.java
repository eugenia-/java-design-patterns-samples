package com.company.designpatternsexamples.behavioral.interpreter.example1.expression;

import com.company.designpatternsexamples.behavioral.interpreter.example1.InterpreterContext;

/**
 * @author eugenia
 */
public interface Expression {

    String interpret(InterpreterContext ic);
}
