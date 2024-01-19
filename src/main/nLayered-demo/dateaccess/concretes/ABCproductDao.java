package dateaccess.concretes;

import dateaccess.abstracts.ProductDao;
import entities.cocnretes.Product;

import java.util.List;

public class ABCproductDao implements ProductDao {
    @Override
    public void add(Product product) {
        System.out.println("with ABC :"+ product.getName());
    }

    @Override
    public void update(Product product) {

    }

    @Override
    public void delete(Product product) {

    }

    @Override
    public Product get(int id) {
        return null;
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
