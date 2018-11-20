package com.company.designpatternsexamples.behavioral.command.example2;

import com.company.designpatternsexamples.behavioral.command.example2.command.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * Invoker object to which requests are sent
 *
 * @author eugenia
 */
class Programmer {

    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (Order order : orderList) {
            order.placeOrder();
        }
        orderList.clear();
    }
}
