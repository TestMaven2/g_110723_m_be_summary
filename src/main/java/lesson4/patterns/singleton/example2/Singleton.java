package lesson4.patterns.singleton.example2;

// Минус - непотокобезопасен
// Плюс - ленивая инициализация
public class Singleton {

    private static Singleton instance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}