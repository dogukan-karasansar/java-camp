package kodlamaIO.dataAccess.abstracts;

import kodlamaIO.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product, Integer> {

}
