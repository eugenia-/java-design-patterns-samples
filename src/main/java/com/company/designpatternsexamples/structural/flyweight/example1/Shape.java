package com.company.designpatternsexamples.structural.flyweight.example1;

import java.awt.*;

/**
 * @author eugenia
 */
interface Shape {

    void draw(Graphics g, int x, int y, int width, int height, Color color);
}
