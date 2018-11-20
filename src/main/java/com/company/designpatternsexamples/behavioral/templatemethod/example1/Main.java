package com.company.designpatternsexamples.behavioral.templatemethod.example1;

import com.company.designpatternsexamples.behavioral.templatemethod.example1.building.GlassHouse;
import com.company.designpatternsexamples.behavioral.templatemethod.example1.building.HouseTemplate;
import com.company.designpatternsexamples.behavioral.templatemethod.example1.building.WoodenHouse;

/**
 * Housing Client
 *
 * @author eugenia
 */
public class Main {

    public static void main(String[] args) {

        HouseTemplate houseType = new WoodenHouse();

        houseType.buildHouse();
        System.out.println("************");

        houseType = new GlassHouse();

        houseType.buildHouse();
    }
}
