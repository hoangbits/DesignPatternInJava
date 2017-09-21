package Singleton;

public class Main {

    public static void main(String[] args) {
        SingletonClass singletonClass = SingletonClass.getInstance();
        SingletonClass singletonClass1 = SingletonClass.getInstance();
        System.out.println("Instance 1 hash:"+singletonClass.hashCode());
        System.out.println("Instance 2 hash:"+singletonClass1.hashCode());
    }
}
