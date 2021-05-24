package kodlamaIO.business.concretes;

import kodlamaIO.business.abstracts.ProductService;
import kodlamaIO.core.utilities.results.DataResult;
import kodlamaIO.core.utilities.results.Result;
import kodlamaIO.core.utilities.results.SuccessDataResult;
import kodlamaIO.core.utilities.results.SuccessResult;
import kodlamaIO.dataAccess.abstracts.ProductDao;
import kodlamaIO.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductManager implements ProductService {

    private ProductDao productDao;

    @Autowired
    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public DataResult<List<Product>> getAll() {
        return new SuccessDataResult<List<Product>>(this.productDao.findAll(), "Data Listelendi");
    }

    @Override
    public Result add(Product product) {
        this.productDao.save(product);
        return new SuccessResult("Ürün Eklendi");
    }
}
