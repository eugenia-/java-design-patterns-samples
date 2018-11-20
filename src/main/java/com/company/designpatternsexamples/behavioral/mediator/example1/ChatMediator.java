package com.company.designpatternsexamples.behavioral.mediator.example1;

/**
 * Mediator Pattern Interface.
 * Defines the contract for concrete mediators.
 *
 * @author eugenia
 */
interface ChatMediator {
    void sendMessage(String msg, User user);

    void addUser(User user);
}
