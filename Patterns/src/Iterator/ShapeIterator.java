package Iterator;

import Model.Shape;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

// Behavioral GoF Pattern - Iterator
public class ShapeIterator implements Iterator<Shape> {
    private ArrayList<Shape> shapes;
    private int index = 0;

    public ShapeIterator(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }

    @Override
    public boolean hasNext() {
        return index < shapes.size();
    }

    @Override
    public Shape next() {
        return shapes.get(index++);
    }

    @Override
    public void remove() {
        shapes.remove(--index);
    }
}
