package lesson4.patterns.singleton.example1;

public class Main {

    public static void main(String[] args) {

//        Singleton singleton = new Singleton();
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton == singleton1);
    }
}