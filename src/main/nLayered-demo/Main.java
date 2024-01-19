import JlLogger.JLoggerManager;
import business.abstracts.ProductService;
import business.concretes.ProductManager;
import core.adapters.JloggerManagerAdapter;
import dateaccess.concretes.ABCproductDao;
import dateaccess.concretes.HibernateProductDao;
import entities.cocnretes.Product;

public class Main {
    public static void main(String[] args) {

        // ToDo Spring ioC
        ProductService productService = new ProductManager(new ABCproductDao(),
                new JloggerManagerAdapter());

        Product product = new Product(2,2,"Apple",12,58);
        productService.add(product);
    }
}
