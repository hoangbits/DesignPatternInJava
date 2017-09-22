package Factory;

/**
 * Created by hoang on 22/09/2017.
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("inside Square::draw() method");
    }
}
