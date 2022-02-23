package ge.softlab.bysell2.service;

import ge.softlab.bysell2.model.Product;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface ProductService {
     List<Product> getAllProduct();
}
