package org.bhoopendra.app.orders.controllers;

import org.bhoopendra.app.orders.bean.Product;
import org.bhoopendra.app.orders.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/products")
    public ResponseEntity<Product> getProducts(){
        return new ResponseEntity(productService.getProducts(), HttpStatus.OK);
    }
}
