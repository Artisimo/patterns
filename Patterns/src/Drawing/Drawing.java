package Drawing;

import Model.Shape;

import java.util.ArrayList;

// Structural GoF Pattern - Composite
public class Drawing implements Shape {
    private ArrayList<Shape> shapes = new ArrayList<>();

    public void add(Shape shape) {
        shapes.add(shape);
    }

    public void remove(Shape shape) {
        shapes.remove(shape);
    }

    @Override
    public void draw() {
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
