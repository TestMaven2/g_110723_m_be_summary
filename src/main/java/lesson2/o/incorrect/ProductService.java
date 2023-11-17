package lesson2.o.incorrect;

// Здесь нарушен принцип открытости-закрытости,
// то есть мы вмешались в старый код вместо того,
// чтобы унаследоваться и создать новый необходимый нам сервис.
// Таким образом мы можем нарушить старую логику, связанную
// со старой реализацией сервиса и при этом мы создаём код,
// который относится к розничной точке, и никогда не будет работать
// в версии приложения для оптовой точки, и наоборот.

public class ProductService {

    public void generateArticle(Product product, boolean forRetail) {

        if (forRetail) {
            product.setArticle("R-" + product.getName());
        } else {
            product.setArticle("W-" + product.getName());
        }
    }
}