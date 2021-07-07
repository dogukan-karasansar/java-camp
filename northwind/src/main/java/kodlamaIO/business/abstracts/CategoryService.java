package kodlamaIO.business.abstracts;

import kodlamaIO.core.utilities.results.Result;
import kodlamaIO.entities.concretes.Category;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface CategoryService {
    List<Category> getAll();
    Result add(Category category);
}
