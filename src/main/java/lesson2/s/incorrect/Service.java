package lesson2.s.incorrect;

// Здесь нарушен первый принцип SOLID - принцип единой ответственности.
// Мы создали сервис, который отвечает сразу за всё,
// и за действия, связанные с продуктами, и за действия,
// связанные с покупателями, и за валидацию.
// Правильно - разнести эту логику по разным сервисам.

public class Service {

    public boolean checkPassword(String password) {
        return password.length() >= 5;
    }

    public void checkAge(Customer customer) {
        if (customer.getAge() < 12) {
            System.out.println("Возраст слишком мал!");
        }
    }

    public void addProduct(Customer customer, Product product) {
        customer.getProducts().add(product);
    }

    public void generateArticle(Product product) {
        product.setArticle("A-" + product.getName());
    }
}