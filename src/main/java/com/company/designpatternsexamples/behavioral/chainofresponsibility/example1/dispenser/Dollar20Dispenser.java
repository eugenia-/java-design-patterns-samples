package com.company.designpatternsexamples.behavioral.chainofresponsibility.example1.dispenser;

/**
 * Implementation of 20$ dispense method
 *
 * @author eugenia
 */
class Dollar20Dispenser implements DispenseChain {

    private DispenseChain chain;

    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    public void dispense(Currency cur) {
        if (cur.getAmount() >= 20) {
            int num = cur.getAmount() / 20;
            int remainder = cur.getAmount() % 20;
            System.out.println("Dispensing " + num + " 20$ note");
            if (remainder != 0) {
                this.chain.dispense(new Currency(remainder));
            }
        } else {
            this.chain.dispense(cur);
        }
    }
}
