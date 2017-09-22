package Proxy;

/**
 * Created by hoang on 22/09/2017.
 */
public class RealImage implements Image {
    private String fileName;
    public RealImage(String fileName){
        this.fileName = fileName;
        loadImageFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("displaying image");
    }

    private void loadImageFromDisk(String fileName){
        System.out.println("Load image from disk");
    }
}
