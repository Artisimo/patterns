package Decorator;

import Model.Shape;

public class ColorDecorator extends ShapeDecorator {
    private String color;

    public ColorDecorator(Shape decoratedShape, String color) {
        super(decoratedShape);
        this.color = color;
    }

    public void draw() {
        decoratedShape.draw();
        System.out.println("Color: " + color);
    }
}
