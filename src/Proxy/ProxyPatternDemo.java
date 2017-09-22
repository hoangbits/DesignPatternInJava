package Proxy;

/**
 * Created by hoang on 22/09/2017.
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("new file.png");
        image.display();
        System.out.println("----i think i loaded----");
        image.display();
    }
}
