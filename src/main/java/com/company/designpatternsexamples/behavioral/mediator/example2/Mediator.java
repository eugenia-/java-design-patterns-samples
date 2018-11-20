package com.company.designpatternsexamples.behavioral.mediator.example2;

/**
 * Mediator interface
 * Defines the contract for concrete mediators.
 *
 * @author eugenia
 */
interface Mediator {

    void send(String message, Colleague colleague);
}
