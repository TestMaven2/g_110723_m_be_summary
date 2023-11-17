package lesson2.l.incorrect;

// Здесь мы нарушаем третий принцип - принцип подстановки Барбары Лисков.
// При подстановке одного наследника у нас всё работает хорошо,
// но при подстановке второго наследника программа падает.

public class Main {

    public static void main(String[] args) {

        CustomerService service = new CustomerService();
        Customer customer1 = new PrivilegedCustomer(25);
        service.buyProducts(customer1);

        Customer customer2 = new NewCustomer(25);
        service.buyProducts(customer2);

        Customer customer3 = new PrivilegedCustomer(30);
        service.buyProducts(customer3);
    }
}