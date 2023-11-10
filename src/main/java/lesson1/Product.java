package lesson1;

import java.util.Objects;

public class Product {

    /**
     * Идентификатор продукта
     */
    private int id;

    /**
     * Артикул продукта
     */
    private String article;

    /**
     * Поле, показывающее, активный ли в данный момент продукт
     */
    private boolean isActive;

    /**
     * Наименование продукта
     */
    private String name;

    /**
     * Цена продукта
     */
    private double price;

    /**
     * Наименование поставщика продукта
     */
    private String supplier;

    public Product(String name, double price, String supplier) {
        this.isActive = true;
        this.name = name;
        this.price = price;
        this.supplier = supplier;
    }

    public int getId() {
        return id;
    }

    public String getArticle() {
        return article;
    }

    public boolean isActive() {
        return isActive;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && isActive == product.isActive && Double.compare(product.price, price) == 0 && Objects.equals(article, product.article) && Objects.equals(name, product.name) && Objects.equals(supplier, product.supplier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, article, isActive, name, price, supplier);
    }

    @Override
    public String toString() {
        // Продукт: идентификатор - 1, наименование - Банан, цена - 120.00,
        // поставщик - Лучшие бананы, артикул - Б100, активный - да.
        return String.format("Продукт: ИД - %d, наименование - %s, цена - %.2f, поставщик - %s, артикул - %s, активный - %s.",
                id, name, price, supplier, article, isActive ? "да" : "нет");
    }
}