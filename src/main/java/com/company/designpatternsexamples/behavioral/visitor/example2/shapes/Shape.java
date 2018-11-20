package com.company.designpatternsexamples.behavioral.visitor.example2.shapes;

import com.company.designpatternsexamples.behavioral.visitor.example2.visitor.Visitor;

/**
 * @author eugenia
 */
public interface Shape {

    void move(int x, int y);

    void draw();

    String accept(Visitor visitor);

}
