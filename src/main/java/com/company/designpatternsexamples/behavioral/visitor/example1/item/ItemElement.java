package com.company.designpatternsexamples.behavioral.visitor.example1.item;

import com.company.designpatternsexamples.behavioral.visitor.example1.visitor.ShoppingCartVisitor;

/**
 * @author eugenia
 */
public interface ItemElement {

    /**
     * The method should call visit method of {@link ShoppingCartVisitor} and pass itself as argument
     *
     * @param visitor {@link ShoppingCartVisitor}
     * @return cost
     */
    int accept(ShoppingCartVisitor visitor);
}
