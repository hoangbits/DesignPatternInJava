package Factory;

/**
 * Created by hoang on 22/09/2017.
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("inside Circle::draw method!");
    }
}
