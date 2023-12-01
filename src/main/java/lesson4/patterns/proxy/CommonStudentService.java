package lesson4.patterns.proxy;

import java.util.List;

public class CommonStudentService implements StudentService {

    @Override
    public List<Student> getAllStudents() {
        return RemoteService.getStudents();
    }

    @Override
    public Student getStudentById(int id) {
        return getAllStudents()
                .stream()
                .filter(x -> x.getId() == id)
                .findFirst()
                .orElse(null);
    }
}