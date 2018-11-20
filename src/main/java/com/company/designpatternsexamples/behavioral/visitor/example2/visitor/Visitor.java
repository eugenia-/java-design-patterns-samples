package com.company.designpatternsexamples.behavioral.visitor.example2.visitor;

import com.company.designpatternsexamples.behavioral.visitor.example2.shapes.Circle;
import com.company.designpatternsexamples.behavioral.visitor.example2.shapes.CompoundShape;
import com.company.designpatternsexamples.behavioral.visitor.example2.shapes.Dot;
import com.company.designpatternsexamples.behavioral.visitor.example2.shapes.Rectangle;

/**
 * @author eugenia
 */
public interface Visitor {

    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}
