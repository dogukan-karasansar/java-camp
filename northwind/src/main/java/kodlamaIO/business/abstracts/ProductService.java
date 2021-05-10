package kodlamaIO.business.abstracts;

import kodlamaIO.entities.concretes.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();
}
