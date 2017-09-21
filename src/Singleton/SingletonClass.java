package Singleton;

/**
 * Created by hoang on 21/09/2017.
 */
public class SingletonClass {
    private static volatile SingletonClass singleton  = new SingletonClass();

    //private Contructor
    private SingletonClass(){}

    public static SingletonClass getInstance(){
        return  singleton;
    }
    public void printSomething(){
        System.out.println("Life is hard");
    }
}
