package com.company.designpatternsexamples.behavioral.visitor.example1.visitor;

import com.company.designpatternsexamples.behavioral.visitor.example1.item.Book;
import com.company.designpatternsexamples.behavioral.visitor.example1.item.Fruit;

/**
 * Contains visit() method for different type of items that will be implemented by concrete visitor class.
 *
 * @author eugenia
 */
public interface ShoppingCartVisitor {

    int visit(Book book);

    int visit(Fruit fruit);
}
