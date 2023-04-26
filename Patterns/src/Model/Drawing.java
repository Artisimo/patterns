package Model;

import java.util.ArrayList;
import java.util.List;

// Structural GoF Pattern - Composite
class Drawing implements Shape {
    private List<Shape> shapes = new ArrayList<>();

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