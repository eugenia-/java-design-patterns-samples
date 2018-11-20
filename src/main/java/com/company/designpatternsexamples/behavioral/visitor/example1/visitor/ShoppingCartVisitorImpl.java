package com.company.designpatternsexamples.behavioral.visitor.example1.visitor;

import com.company.designpatternsexamples.behavioral.visitor.example1.item.Book;
import com.company.designpatternsexamples.behavioral.visitor.example1.item.Fruit;

/**
 * @author eugenia
 */
public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

    private static final int DISCOUNT_PRICE = 50;
    private static final int DISCOUNT = 5;


    /**
     * Gets cost and applies {@link this#DISCOUNT} if book price is greater than {@link this#DISCOUNT_PRICE}
     *
     * @param book {@link Book}
     * @return cost
     */
    @Override
    public int visit(Book book) {
        int cost;
        if (book.getPrice() > DISCOUNT_PRICE) {
            cost = book.getPrice() - DISCOUNT;
        } else cost = book.getPrice();
        System.out.println("Book ISBN::" + book.getIsbnNumber() + " cost =" + cost);
        return cost;
    }

    /**
     * Gets cost according weight
     *
     * @param fruit {@link Fruit}
     * @return cost
     */
    @Override
    public int visit(Fruit fruit) {
        int cost = fruit.getPricePerKg() * fruit.getWeight();
        System.out.println(fruit.getName() + " cost = " + cost);
        return cost;
    }
}
