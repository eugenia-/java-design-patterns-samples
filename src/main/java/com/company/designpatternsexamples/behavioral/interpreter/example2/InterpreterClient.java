package com.company.designpatternsexamples.behavioral.interpreter.example2;

import com.company.designpatternsexamples.behavioral.interpreter.example2.expression.AddExpression;
import com.company.designpatternsexamples.behavioral.interpreter.example2.expression.Expression;
import com.company.designpatternsexamples.behavioral.interpreter.example2.expression.MultiplyExpression;

/**
 * @author eugenia
 */
public class InterpreterClient {

    private InterpreterEngine engine = new InterpreterEngine();

    public int interpret(String input) {
        Expression expression = null;

        if (input.contains("add")) {
            expression = new AddExpression(input);
        } else if (input.contains("multiply")) {
            expression = new MultiplyExpression(input);
        }

        int result = expression.interpret(engine);
        System.out.println(input);
        return result;
    }
}
