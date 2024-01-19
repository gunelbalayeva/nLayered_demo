package business.concretes;

import business.abstracts.ProductService;
import core.services.LoggerService;
import dateaccess.abstracts.ProductDao;
import entities.cocnretes.Product;

import java.util.List;

public class ProductManager implements ProductService {
    private ProductDao productDao;

   private LoggerService loggerService;
    public ProductManager(ProductDao productDao, LoggerService loggerService) {
        super();
        this.productDao = productDao;
        this.loggerService = loggerService;
    }
    @Override
    public void add(Product product) {
        if (product.getCatagoryId() == 1) {
            System.out.println("bu katagoriyada mehsul qebul edilmir");
            return;
        }
        this.productDao.add(product);
        this.loggerService.logToSystem("product added..");
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
