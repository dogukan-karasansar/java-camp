package kodlamaIO.api.controllers;

import kodlamaIO.business.abstracts.CategoryService;
import kodlamaIO.entities.concretes.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/categories")

public class CategorysController {

    private CategoryService categoryService;

    @Autowired
    public CategorysController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/getall")
    public List<Category> getAll() {
        return this.categoryService.getAll();
    }

}