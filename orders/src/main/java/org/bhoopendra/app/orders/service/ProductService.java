package org.bhoopendra.app.orders.service;

import org.bhoopendra.app.orders.bean.Product;

import java.util.List;

public interface ProductService {
    List<Product> getProducts();
}