package lesson4.patterns.proxy;

public class Application {

    private StudentService service;

    public Application(StudentService service) {
        this.service = service;
    }

    public void start() {
        service.getAllStudents().forEach(System.out::println);
        System.out.println(service.getStudentById(1));
        System.out.println(service.getStudentById(2));
        System.out.println(service.getStudentById(3));
        System.out.println(service.getStudentById(4));
        System.out.println(service.getStudentById(5));
        System.out.println(service.getStudentById(6));
    }
}