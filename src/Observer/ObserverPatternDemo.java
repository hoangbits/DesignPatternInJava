package Observer;

/**
 * Created by hoang on 22/09/2017.
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);
        subject.setState(12);
    }
}
