package Observer;

/**
 * Created by hoang on 22/09/2017.
 */
public class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println("Binary String: " +Integer.toBinaryString(subject.getState()));
    }
}
