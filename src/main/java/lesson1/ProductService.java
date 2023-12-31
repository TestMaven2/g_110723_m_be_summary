package lesson1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService {

    /**
     * Переменная нужна для того, чтобы присваивать продуктам
     * последовательные идентификаторы
     */
    private int currentId;

    /**
     * В это поле будет сохраняться объект стороннего сервиса
     */
    private MerchService merchService;

    /**
     * База данных продуктов
     */
    private Map<Integer, Product> products = new HashMap<>();

    public void setMerchService(MerchService merchService) {
        this.merchService = merchService;
    }

// Запрос всех продуктов:
    // Мы должны запросить сторонний сервис, нужна ли информация о поставщике.
    // Если нет - удаляем информацию из объектов продуктов.

    public List<Product> getAll() {
        List<Product> result = new ArrayList<>(products.values());

        if (merchService.withoutSupplierInfo()) {
            for (Product product : result) {
                product.setSupplier(null);
            }
        }

        return result;
    }

    // Запрос одного продукта:
    // Мы должны запросить у стороннего сервиса наценку.
    // Применяем наценку к запрошенному товару.

    public Product getById(int id) {
        Product product = products.get(id);

        if (product != null) {
            double markup = merchService.getMarkup();
            double newPrice = product.getPrice() * (100 + markup) / 100;
            product.setPrice(newPrice);
        }

        return product;
    }

    // Сохранение продукта:
    // Мы должны обратиться к стороннему сервису, чтобы он создал артикул.
    // Созданный артикул применяется к продукту, сохраняем продукт в БД.

    public Product save(Product product) {
        product.setId(++currentId);
        merchService.setArticle(product);
        products.put(product.getId(), product);
        return product;
    }

    // Удаление продукта:
    // Мы должны обратиться к стороннему сервису, чтобы понять
    // удалять продукт из БД физически или просто выставлять статус в false.
    // Поступаем соответствующим образом.

    public void delete(int id) {
        if (merchService.fullDeletion()) {
            products.remove(id);
        } else {
            Product product = products.get(id);

            if (product != null) {
                product.setActive(false);
            }
        }
    }
}