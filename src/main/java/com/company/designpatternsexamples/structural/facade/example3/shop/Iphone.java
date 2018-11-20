package com.company.designpatternsexamples.structural.facade.example3.shop;

/**
 * @author eugenia
 */
class Iphone implements MobileShop {

    public void modelNo() {
        System.out.println(" Iphone 6 ");
    }

    public void price() {
        System.out.println(" Rs 65000.00 ");
    }
}
