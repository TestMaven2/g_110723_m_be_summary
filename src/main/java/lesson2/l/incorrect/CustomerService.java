package lesson2.l.incorrect;

public class CustomerService {

    public void addProduct(Customer customer, Product product) {
        customer.getProducts().add(product);
    }

    public void buyProducts(Customer customer) {
        customer.applyDiscount();
        customer.getProducts().clear();
        System.out.println("Операция успешна. Спасибо за покупку!");
    }
}