import Decorator.ColorDecorator;
import Drawing.Drawing;
import Factory.ShapeFactory;
import Iterator.ShapeIterator;
import Model.Circle;
import Model.Rectangle;
import Model.Shape;
import Output.TextOutput;

import java.util.ArrayList;

public class application {
    static ShapeFactory facotry = new ShapeFactory();
    
    public static void main(String args[])
    {
        //Creational - Factory example (Get the thing which creates objects)
        ArrayList<Shape> shapes = demonstrateFactory();

        // Behavioral - Iterator example
        demonstrateIterator(shapes);

        // Structural - CompositeExample
        demonstrateComposite(shapes);

        // non-creational - adapter example
        demonstrateAdapter(shapes);

        // non-creational - decorator example
        demonstrateDecorator(shapes.get(0));
    }

    public static ArrayList<Shape> demonstrateFactory(){

        System.out.println("***************************************** Currently at factory example *****************************************");
        ArrayList<Shape> shapes = new ArrayList<Shape>();

        Circle circle = (Circle) facotry.getShape("circle");
        Rectangle rectangle = (Rectangle) facotry.getShape("rectangle");

        shapes.add(circle);
        shapes.add(rectangle);

        if(circle.getClass().getSimpleName().equals("Circle")){
            System.out.println("The circle created by the factory is an instance of circle");
        }
        System.out.println();
        return shapes;
    }

    public static void demonstrateIterator(ArrayList<Shape> shapes){
        System.out.println("***************************************** Currently at Iterator example *****************************************");
        ShapeIterator iterator = new ShapeIterator(shapes);

        int count = 0;
        
        while(iterator.hasNext()){
            count++;
            iterator.next();
        }

        System.out.println("There are " + count + " shapes to iterate through");
        System.out.println();
    }

    public static void demonstrateComposite(ArrayList<Shape> shapes){
        System.out.println("***************************************** Currently at composite example *****************************************");
         Drawing drawing = new Drawing();

         drawing.add(shapes.get(0));
         drawing.add(shapes.get(1));

         drawing.draw();
        System.out.println();
    }

    public static void demonstrateAdapter(ArrayList<Shape> shapes){
        System.out.println("***************************************** Currently at adapter example *****************************************");
        TextOutput outputGenerator = new TextOutput();

        outputGenerator.printShapes(shapes);

        System.out.println();
    }

    public static void demonstrateDecorator(Shape shape){
        System.out.println("***************************************** Currently at decorator example *****************************************");
        ColorDecorator decorator = new ColorDecorator(shape, "Red");
        decorator.draw();
        System.out.println();
    }
}
