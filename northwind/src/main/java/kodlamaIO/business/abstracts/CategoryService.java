package kodlamaIO.business.abstracts;

import kodlamaIO.entities.concretes.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAll();
}
