package lesson2.o.correct;

public class WholesaleProductService extends ProductService {

    @Override
    public void generateArticle(Product product) {
        product.setArticle("W-" + product.getName());
    }
}