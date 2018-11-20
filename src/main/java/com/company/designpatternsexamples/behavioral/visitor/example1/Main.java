package com.company.designpatternsexamples.behavioral.visitor.example1;

import com.company.designpatternsexamples.behavioral.visitor.example1.item.Book;
import com.company.designpatternsexamples.behavioral.visitor.example1.item.Fruit;
import com.company.designpatternsexamples.behavioral.visitor.example1.item.ItemElement;
import com.company.designpatternsexamples.behavioral.visitor.example1.visitor.ShoppingCartVisitor;
import com.company.designpatternsexamples.behavioral.visitor.example1.visitor.ShoppingCartVisitorImpl;

/**
 * @author eugenia
 */
public class Main {

    public static void main(String[] args) {
        ItemElement[] items = new ItemElement[]{
                new Book(20, "1234"),
                new Book(100, "5678"),
                new Fruit(10, 2, "Banana"),
                new Fruit(5, 5, "Apple")};

        int total = calculatePrice(items);
        System.out.println("Total Cost = " + total);
    }

    /**
     * Calculates the total amount to be paid
     *
     * @param items array of {@link ItemElement}
     * @return total cost
     */
    private static int calculatePrice(ItemElement[] items) {
        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        int sum = 0;
        for (ItemElement item : items) {
            sum = sum + item.accept(visitor);
        }
        return sum;
    }
}
