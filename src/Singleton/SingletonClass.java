package Singleton;

/**
 * Created by hoang on 21/09/2017.
 */
public class SingletonClass {
    private static SingletonClass singleton;

    //private Contructor
    private SingletonClass(){}

    public static SingletonClass getInstance(){
        if(singleton == null){
            singleton = new SingletonClass();
        }
        return singleton;
    }
    public void printSomething(){
        System.out.println("Life is hard");
    }
}
