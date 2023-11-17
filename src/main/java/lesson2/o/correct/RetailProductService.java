package lesson2.o.correct;

public class RetailProductService extends ProductService {

    @Override
    public void generateArticle(Product product) {
        product.setArticle("R-" + product.getName());
    }
}