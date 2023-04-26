package Output;

import Model.Shape;

import java.util.List;

public class TextOutput implements ShapeOutput {
    @Override
    public void printShapes(List<Shape> shapes) {
        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }
    }
}
