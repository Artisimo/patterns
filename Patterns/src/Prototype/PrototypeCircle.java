package Prototype;

import Model.Shape;

// Non-behavioral GoF Pattern - Prototype
public class PrototypeCircle implements Cloneable, Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Prototype Circle");
    }

    @Override
    public PrototypeCircle clone() throws CloneNotSupportedException {
        return (PrototypeCircle) super.clone();
    }
}
