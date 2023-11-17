package lesson2.l.correct;

public class CustomerService {

    public void addProduct(Customer customer, Product product) {
        customer.getProducts().add(product);
    }

    public void makePurchase(Customer customer) {
        customer.buyProducts();
        System.out.println("Операция успешна. Спасибо за покупку!");
    }
}