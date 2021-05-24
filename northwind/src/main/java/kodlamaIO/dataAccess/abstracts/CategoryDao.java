package kodlamaIO.dataAccess.abstracts;

import kodlamaIO.entities.concretes.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDao extends JpaRepository<Category, Integer> {
}
