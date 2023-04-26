package Output;

import Model.Shape;

import java.util.List;

public class TextOutput implements ShapeOutput {
    @Override
    public void printShapes(List<Shape> shapes) {
        for (Shape shape : shapes) {
            if(shape.getClass().getSimpleName().equals("Circle")) {
                System.out.println("I am currently printing a circle");
            }
            else{
                System.out.println("I am currently printing a rectangle");
            }
        }
    }
}
