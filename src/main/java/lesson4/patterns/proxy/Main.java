package lesson4.patterns.proxy;

public class Main {

    public static void main(String[] args) {

        Application application = new Application(new CommonStudentServiceProxy());

        long start = System.currentTimeMillis();
        application.start();
        System.out.printf("Приложение отработало за %d секунд.",
                (System.currentTimeMillis() - start) / 1000);
    }
}