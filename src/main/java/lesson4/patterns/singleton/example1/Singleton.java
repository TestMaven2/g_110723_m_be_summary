package lesson4.patterns.singleton.example1;

// Минус - неленивая инициализация
// Плюс - потокобезопасность
public class Singleton {

    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {
        return INSTANCE;
    }
}