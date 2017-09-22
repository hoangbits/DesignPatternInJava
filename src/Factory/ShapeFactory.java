package Factory;

/**
 * Created by hoang on 22/09/2017.
 */
public class ShapeFactory {
    public Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("Square")){
            return new Square();
        }
        if(shapeType.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }
        if(shapeType.equalsIgnoreCase("Circle")){
            return new Circle();
        }
        return null;
    }
}
