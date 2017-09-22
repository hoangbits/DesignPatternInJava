package Factory;

/**
 * Created by hoang on 22/09/2017.
 */
public class FactoryPatternDemo  {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape square = shapeFactory.getShape("Square");
        Shape circle = shapeFactory.getShape("circle");
        Shape rectangle = shapeFactory.getShape("rectangle");
        square.draw();
        circle.draw();
        rectangle.draw();
    }
}
