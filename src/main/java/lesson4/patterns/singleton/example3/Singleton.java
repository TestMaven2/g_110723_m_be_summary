package lesson4.patterns.singleton.example3;

// Плюс - ленивая инициализация
// Плюс - потокобезопасность
// Минус - низкая производительность за счёт синхронизированного метода
public class Singleton {

    private static Singleton instance;

    private Singleton() {

    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}