package ge.softlab.bysell2.service;

import ge.softlab.bysell2.model.Product;
import ge.softlab.bysell2.repository.jpa.ProductReposytory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{
   ProductReposytory productReposytory;
   @Autowired
    ProductServiceImpl(ProductReposytory productReposytory){
        this.productReposytory=productReposytory;
    }
    @Override
    public List<Product> getAllProduct() {
        return productReposytory.findAll();
    }
}
