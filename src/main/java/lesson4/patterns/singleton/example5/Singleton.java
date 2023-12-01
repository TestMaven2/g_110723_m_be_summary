package lesson4.patterns.singleton.example5;

// Плюс - ленивая инициализация
// Плюс - потокобезопасность
// Плюс - высокая производительность
public class Singleton {

    private Singleton() {

    }

    private static class SingletonHolder {
        public static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}