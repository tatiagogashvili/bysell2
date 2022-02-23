package ge.softlab.bysell2.controller;

import ge.softlab.bysell2.model.Product;
import ge.softlab.bysell2.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("products")
public class ProductController {
    ProductService productService;

    @GetMapping
    public List<Product> getProducts() {
        return productService.getAllProduct();
    };
    @Autowired
    ProductController(ProductService productService) {
        this.productService = productService;
    }
};

