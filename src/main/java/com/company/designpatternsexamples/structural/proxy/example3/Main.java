package com.company.designpatternsexamples.structural.proxy.example3;

/**
 * @author eugenia
 */
public class Main {

    public static void main(String[] args) {
        OfficeInternetAccess access = new ProxyInternetAccess("Robert Harrison");
        access.grantInternetAccess();
    }
}
