package dateaccess.abstracts;

import entities.cocnretes.Product;

import java.util.List;

public interface ProductDao {
    void add(Product product);
    void update(Product product);
    void delete(Product product);
    Product get(int id);
   List<Product> getAll();
}
