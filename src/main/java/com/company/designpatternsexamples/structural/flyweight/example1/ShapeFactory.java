package com.company.designpatternsexamples.structural.flyweight.example1;

import java.util.HashMap;

/**
 * The factory will be used by client programs to instantiate the Object,
 * so we need to keep a map of Objects in the factory that should not be accessible by client application.
 *
 * @author eugenia
 */
class ShapeFactory {

    private static final HashMap<ShapeType, Shape> shapes = new HashMap<ShapeType, Shape>();

    public static Shape getShape(ShapeType type) {
        Shape shapeImpl = shapes.get(type);

        if (shapeImpl == null) {
            switch (type) {
                case LINE:
                    shapeImpl = new Line();
                    break;
                case OVAL_FILL:
                    shapeImpl = new Oval(true);
                    break;
                case OVAL_NOFILL:
                    shapeImpl = new Oval(false);
                    break;
                default:
                    throw new RuntimeException(type + " shape type is not supported");
            }
            shapes.put(type, shapeImpl);
        }
        return shapeImpl;
    }

    enum ShapeType {
        OVAL_FILL, OVAL_NOFILL, LINE;
    }
}
