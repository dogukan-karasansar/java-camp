package kodlamaIO.business.concretes;

import kodlamaIO.business.abstracts.CategoryService;
import kodlamaIO.dataAccess.abstracts.CategoryDao;
import kodlamaIO.entities.concretes.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
