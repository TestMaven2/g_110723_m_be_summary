package lesson1;

public interface MerchService {

    /**
     * Метод сообщает, нужна ли информация о поставщике
     * внутри объекта продукта
     */
    boolean withoutSupplierInfo();

    /**
     * Метод сообщает, какую наценку нужно применить к продукту
     */
    double getMarkup();

    /**
     * Метод присваивает артикул продукту
     */
    void setArticle(Product product);

    /**
     * Метод сообщает, как мы должны поступать при удалении продукта,
     * физически удалять продукт из базы данных
     * или просто выставить его параметр isActive в false
     */
    boolean fullDeletion();
}