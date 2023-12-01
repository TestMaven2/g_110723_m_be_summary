package lesson4.patterns.proxy;

import java.util.List;

public class RemoteService {

    private static List<Student> students = List.of(
            new Student(1, "Vanya"),
            new Student(2, "Petya"),
            new Student(3, "Sidor"),
            new Student(4, "Vasya"),
            new Student(5, "Dima")
    );

    public static List<Student> getStudents() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return students;
    }
}