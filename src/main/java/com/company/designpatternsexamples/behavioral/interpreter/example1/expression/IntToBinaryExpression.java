package com.company.designpatternsexamples.behavioral.interpreter.example1.expression;

import com.company.designpatternsexamples.behavioral.interpreter.example1.InterpreterContext;

/**
 * Expression implementation that consume the Int To Binary functionality provided by the interpreter context
 *
 * @author eugenia
 */
public class IntToBinaryExpression implements Expression {

    private int i;

    public IntToBinaryExpression(int c) {
        this.i = c;
    }

    public String interpret(InterpreterContext ic) {
        return ic.getBinaryFormat(this.i);
    }
}
