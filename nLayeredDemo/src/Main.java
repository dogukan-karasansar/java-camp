import business.abstracts.ProductService;
import business.concretes.ProductManager;
import core.JloggerManagerAdapter;
import dataAccess.concretes.AbcProductDao;
import entities.concretes.Product;

public class Main {

    public static void main(String[] args) {
        ProductService productService = new ProductManager(new AbcProductDao(), new JloggerManagerAdapter());
        Product product = new Product(1, 2, "elma", 20, 10);
        productService.add(product);
    }
}
