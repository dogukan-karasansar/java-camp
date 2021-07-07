package kodlamaIO.business.concretes;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import kodlamaIO.business.abstracts.CategoryService;
import kodlamaIO.core.utilities.results.Result;
import kodlamaIO.core.utilities.results.SuccessResult;
import kodlamaIO.dataAccess.abstracts.CategoryDao;
import kodlamaIO.entities.concretes.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@Service
public class CategoryManager implements CategoryService {
    private CategoryDao categoryDao;


    @Autowired
    public CategoryManager(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }

    @Override
    public List<Category> getAll() {
        return this.categoryDao.findAll();
    }

    @Override
    public Result add(Category category) {
        this.categoryDao.save(category);
        return new SuccessResult("Kategori Eklendi");
    }
}
