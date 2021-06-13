package kodlamaIO.api.controllers;

import kodlamaIO.business.abstracts.ProductService;
import kodlamaIO.core.utilities.results.DataResult;
import kodlamaIO.core.utilities.results.Result;
import kodlamaIO.entities.concretes.Product;
import kodlamaIO.entities.dtos.ProductWithCategoryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/products")
@CrossOrigin

public class ProductsController {

    private ProductService productService;

    @Autowired
    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/getall")
    public DataResult<List<Product>> getAll() {
        return this.productService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Product product) {
        return this.productService.add(product);
    }

    @GetMapping("/getByProductName")
    public DataResult<Product> getByProductName(@RequestParam String ProductName) {
        return this.productService.getByProductName(ProductName);
    }

    @GetMapping("/getByProductNameAndCategory")
    public DataResult<Product> getByProductNameAndCategory(@RequestParam("productName") String productName, @RequestParam("categoryId")  int categoryId) {
        return this.productService.getByProductNameAndCategory_CategoryId(productName, categoryId);
    }

    @GetMapping("/getByProductNameContains")
    public DataResult<List<Product>> getByProductNameContains(@RequestParam String productName) {
        return this.productService.getByProductNameContains(productName);
    }

    @GetMapping("/getAll")
    public DataResult<List<Product>> getAll(@RequestParam int pageNo, @RequestParam int pageSize) {
        return this.productService.getAll(pageNo, pageSize);
    }

    @GetMapping("/getAllSorted")
    DataResult<List<Product>> getAllSorted() {
        return this.productService.getAllSorted();
    }

    @GetMapping("/get-product-with-category-details")
    DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails() {
        return this.productService.getProductWithCategoryDetails();
    }


}
