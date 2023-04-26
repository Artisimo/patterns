package Inventory;

import Factory.ShapeFactory;
import Model.Shape;

import java.util.ArrayList;
import java.util.List;

// Non-behavioral GoF Pattern - Singleton
class ShapeInventory {
    private static ShapeInventory instance = null;
    private List<Shape> shapes = new ArrayList<>();

    private ShapeInventory() {
        // Adding some initial shapes to the inventory
        shapes.add(ShapeFactory.getShape("circle"));
        shapes.add(ShapeFactory.getShape("rectangle"));
    }

    public static ShapeInventory getInstance() {
        if (instance == null) {
            instance = new ShapeInventory();
        }
        return instance;
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void removeShape(Shape shape) {
        shapes.remove(shape);
    }

    public List<Shape> getShapes() {
        return shapes;
    }
}
