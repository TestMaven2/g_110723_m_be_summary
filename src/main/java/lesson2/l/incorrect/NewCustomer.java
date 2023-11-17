package lesson2.l.incorrect;

public class NewCustomer extends Customer {

    public NewCustomer(int age) {
        super(age);
    }

    @Override
    public void applyDiscount() {
        throw new UnsupportedOperationException("Скидка неприменима!");
    }
}