package Output;

import Model.Shape;

import java.util.List;

// Non-behavioral GoF Pattern - Adapter
public interface ShapeOutput {
    void printShapes(List<Shape> shapes);
}
