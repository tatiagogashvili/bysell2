package ge.softlab.bysell2.repository.jpa;

import ge.softlab.bysell2.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.Vector;

@Repository
public interface ProductReposytory extends JpaRepository<Product,String> {
/*    Vector <Product> getAllBy(String ean_code);*/
}
