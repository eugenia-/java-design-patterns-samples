package com.company.designpatternsexamples.structural.flyweight.example1;

import java.awt.*;

/**
 * Oval class, that has intrinsic property to determine whether to fill the Oval with given color or not
 * @author eugenia
 */
class Oval implements Shape {

    //intrinsic property
    private boolean fill;

     Oval(boolean f) {
        this.fill = f;
        System.out.println("Creating Oval object with fill=" + f);
        //adding time delay
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void draw(Graphics circle, int x, int y, int width, int height, Color color) {
        circle.setColor(color);
        circle.drawOval(x, y, width, height);
        if (fill) {
            circle.fillOval(x, y, width, height);
        }
    }
}
