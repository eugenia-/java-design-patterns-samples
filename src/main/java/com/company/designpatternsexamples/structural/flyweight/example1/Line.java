package com.company.designpatternsexamples.structural.flyweight.example1;

import java.awt.*;

/**
 * Concrete implementation of {@link Shape}
 *
 * @author eugenia
 */
 class Line implements Shape {

     Line() {
        System.out.println("Creating Line object");
        //adding time delay
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void draw(Graphics line, int x1, int y1, int x2, int y2, Color color) {
        line.setColor(color);
        line.drawLine(x1, y1, x2, y2);
    }
}
