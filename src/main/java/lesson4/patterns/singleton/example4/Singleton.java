package lesson4.patterns.singleton.example4;

// Плюс - ленивая инициализация
// Плюс - потокобезопасность
// Плюс - высокая производительность
public class Singleton {

    private static Singleton instance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}