package com.company.designpatternsexamples.behavioral.strategy.example1;

/**
 * @author eugenia
 */
class PayPalStrategy implements PaymentStrategy {

    private String emailId;
    private String password;

    PayPalStrategy(String email, String pwd) {
        this.emailId = email;
        this.password = pwd;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using Paypal.");
    }
}
