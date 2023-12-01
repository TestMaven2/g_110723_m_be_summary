package lesson4.patterns.proxy;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    Student getStudentById(int id);
}