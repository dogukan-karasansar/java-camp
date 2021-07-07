package kodlamaIO.api.controllers;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import kodlamaIO.business.abstracts.CategoryService;
import kodlamaIO.core.utilities.results.Result;
import kodlamaIO.entities.concretes.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/categories")
@CrossOrigin
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

    @PostMapping("/add")
    private Result add(@RequestParam String categoryName, @RequestParam String description, @RequestParam MultipartFile multipartFile) {
        Category category = new Category();
        Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
                "cloud_name", "dgbytpbmp",
                "api_key", "989512684354212",
                "api_secret", "chi4V3d04TlcLwW8CSCwriXMU7c", "secure", true
        ));
        String fileName = multipartFile.getOriginalFilename();
        String prefix = fileName.substring(fileName.lastIndexOf("."));
        File file = null;
        try {
            file = File.createTempFile(fileName, prefix);
            multipartFile.transferTo(file);
            Map uploadResult = cloudinary.uploader().upload(file, ObjectUtils.emptyMap());
            category.setPicture(String.valueOf(uploadResult.get("url")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        category.setCategoryName(categoryName);
        category.setDescription(description);
        return this.categoryService.add(category);
    }

}
