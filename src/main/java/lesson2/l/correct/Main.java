package lesson2.l.correct;

public class Main {

    public static void main(String[] args) {

        CustomerService service = new CustomerService();

        Customer customer1 = new PrivilegedCustomer(25);
        Customer customer2 = new VipCustomer(25);
        Customer customer3 = new NewCustomer(25);

        System.out.println("Привилегированный покупатель:");
        service.makePurchase(customer1);

        System.out.println("VIP покупатель:");
        service.makePurchase(customer2);

        System.out.println("Новый покупатель:");
        service.makePurchase(customer3);
    }
}