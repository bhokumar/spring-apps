package org.iot.apps.controller;

import org.iot.apps.beans.Product;
import org.iot.apps.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping
    public List<Product> getProducts(){
        return productService.getProducts();
    }

    @PostMapping
    public Product createProduct(Product product){
        return product;
    }
}
