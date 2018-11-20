package com.company.designpatternsexamples.behavioral.interpreter.example2.expression;

import com.company.designpatternsexamples.behavioral.interpreter.example2.InterpreterEngine;

/**
 * Interface for expressions
 *
 * @author eugenia
 */
public interface Expression {

    int interpret(InterpreterEngine engine);
}
