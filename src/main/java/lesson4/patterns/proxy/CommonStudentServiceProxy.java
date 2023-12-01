package lesson4.patterns.proxy;

import java.util.List;

public class CommonStudentServiceProxy implements StudentService {

    private CommonStudentService service = new CommonStudentService();
    private List<Student> cache;

    @Override
    public List<Student> getAllStudents() {
        if (cache == null) {
            cache = service.getAllStudents();
        }
        return cache;
    }

    @Override
    public Student getStudentById(int id) {
        if (cache == null) {
            cache = service.getAllStudents();
        }
        for (Student student : cache) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public void clearCache() {
        cache = null;
    }
}