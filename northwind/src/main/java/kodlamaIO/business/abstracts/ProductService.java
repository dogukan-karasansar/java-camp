package kodlamaIO.business.abstracts;

import kodlamaIO.core.utilities.results.DataResult;
import kodlamaIO.core.utilities.results.Result;
import kodlamaIO.entities.concretes.Product;

import java.util.List;

public interface ProductService {
   DataResult<List<Product>> getAll();
   Result add(Product product);
}
