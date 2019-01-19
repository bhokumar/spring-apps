package org.iot.apps.service.impl;

import org.iot.apps.beans.Product;
import org.iot.apps.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public List<Product> getProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1,"Garden Cart","GDN-0023","March 18, 2016", "16 Gallon capacity",42.56,4.2,"http://www.gstatic.com/webp/gallery/1.jpg"));
        products.add(new Product(2,"Tree Cart","GDN-0024","March 19, 2016", "17 Gallon capacity",43.56,4.3,"http://www.gstatic.com/webp/gallery/2.jpg"));
        products.add(new Product(3,"Banyan Cart","GDN-0025","March 20, 2016", "18 Gallon capacity",44.56,4.4,"http://www.gstatic.com/webp/gallery/1.jpg"));
        products.add(new Product(4,"Flip Cart","GDN-0026","March 21, 2016", "19 Gallon capacity",45.56,4.5,"http://www.gstatic.com/webp/gallery/2.jpg"));
        products.add(new Product(5,"Amazon Cart","GDN-0027","March 22, 2016", "20 Gallon capacity",46.56,4.6,"http://www.gstatic.com/webp/gallery/1.jpg"));
        products.add(new Product(6,"SnapDeal Cart","GDN-0028","March 23, 2016", "21 Gallon capacity",47.56,4.7,"http://www.gstatic.com/webp/gallery/2.jpg"));
        products.add(new Product(5,"Amazon Cart","GDN-0027","March 22, 2016", "20 Gallon capacity",46.56,4.6,"http://www.gstatic.com/webp/gallery/1.jpg"));
        products.add(new Product(6,"SnapDeal Cart","GDN-0028","March 23, 2016", "21 Gallon capacity",47.56,4.7,"http://www.gstatic.com/webp/gallery/2.jpg"));
        products.add(new Product(5,"Amazon Cart","GDN-0027","March 22, 2016", "20 Gallon capacity",46.56,4.6,"http://www.gstatic.com/webp/gallery/1.jpg"));
        products.add(new Product(6,"SnapDeal Cart","GDN-0028","March 23, 2016", "21 Gallon capacity",47.56,4.7,"http://www.gstatic.com/webp/gallery/2.jpg"));
        products.add(new Product(5,"Amazon Cart","GDN-0027","March 22, 2016", "20 Gallon capacity",46.56,4.6,"http://www.gstatic.com/webp/gallery/1.jpg"));
        products.add(new Product(6,"SnapDeal Cart","GDN-0028","March 23, 2016", "21 Gallon capacity",47.56,4.7,"http://www.gstatic.com/webp/gallery/2.jpg"));
        products.add(new Product(5,"Amazon Cart","GDN-0027","March 22, 2016", "20 Gallon capacity",46.56,4.6,"http://www.gstatic.com/webp/gallery/1.jpg"));
        products.add(new Product(6,"SnapDeal Cart","GDN-0028","March 23, 2016", "21 Gallon capacity",47.56,4.7,"http://www.gstatic.com/webp/gallery/2.jpg"));
        products.add(new Product(5,"Amazon Cart","GDN-0027","March 22, 2016", "20 Gallon capacity",46.56,4.6,"http://www.gstatic.com/webp/gallery/1.jpg"));
        products.add(new Product(6,"SnapDeal Cart","GDN-0028","March 23, 2016", "21 Gallon capacity",47.56,4.7,"http://www.gstatic.com/webp/gallery/2.jpg"));
        products.add(new Product(5,"Amazon Cart","GDN-0027","March 22, 2016", "20 Gallon capacity",46.56,4.6,"http://www.gstatic.com/webp/gallery/1.jpg"));
        products.add(new Product(6,"SnapDeal Cart","GDN-0028","March 23, 2016", "21 Gallon capacity",47.56,4.7,"http://www.gstatic.com/webp/gallery/2.jpg"));
        products.add(new Product(5,"Amazon Cart","GDN-0027","March 22, 2016", "20 Gallon capacity",46.56,4.6,"http://www.gstatic.com/webp/gallery/1.jpg"));
        products.add(new Product(6,"SnapDeal Cart","GDN-0028","March 23, 2016", "21 Gallon capacity",47.56,4.7,"http://www.gstatic.com/webp/gallery/2.jpg"));
        products.add(new Product(5,"Amazon Cart","GDN-0027","March 22, 2016", "20 Gallon capacity",46.56,4.6,"http://www.gstatic.com/webp/gallery/1.jpg"));
        products.add(new Product(6,"SnapDeal Cart","GDN-0028","March 23, 2016", "21 Gallon capacity",47.56,4.7,"http://www.gstatic.com/webp/gallery/2.jpg"));
        products.add(new Product(5,"Amazon Cart","GDN-0027","March 22, 2016", "20 Gallon capacity",46.56,4.6,"http://www.gstatic.com/webp/gallery/1.jpg"));
        products.add(new Product(6,"SnapDeal Cart","GDN-0028","March 23, 2016", "21 Gallon capacity",47.56,4.7,"http://www.gstatic.com/webp/gallery/2.jpg"));
        products.add(new Product(5,"Amazon Cart","GDN-0027","March 22, 2016", "20 Gallon capacity",46.56,4.6,"http://www.gstatic.com/webp/gallery/1.jpg"));
        products.add(new Product(6,"SnapDeal Cart","GDN-0028","March 23, 2016", "21 Gallon capacity",47.56,4.7,"http://www.gstatic.com/webp/gallery/2.jpg"));
        products.add(new Product(5,"Amazon Cart","GDN-0027","March 22, 2016", "20 Gallon capacity",46.56,4.6,"http://www.gstatic.com/webp/gallery/1.jpg"));
        products.add(new Product(6,"SnapDeal Cart","GDN-0028","March 23, 2016", "21 Gallon capacity",47.56,4.7,"http://www.gstatic.com/webp/gallery/2.jpg"));
        products.add(new Product(5,"Amazon Cart","GDN-0027","March 22, 2016", "20 Gallon capacity",46.56,4.6,"http://www.gstatic.com/webp/gallery/1.jpg"));
        products.add(new Product(6,"SnapDeal Cart","GDN-0028","March 23, 2016", "21 Gallon capacity",47.56,4.7,"http://www.gstatic.com/webp/gallery/2.jpg"));
        products.add(new Product(5,"Amazon Cart","GDN-0027","March 22, 2016", "20 Gallon capacity",46.56,4.6,"http://www.gstatic.com/webp/gallery/1.jpg"));
        products.add(new Product(6,"SnapDeal Cart","GDN-0028","March 23, 2016", "21 Gallon capacity",47.56,4.7,"http://www.gstatic.com/webp/gallery/2.jpg"));
        products.add(new Product(5,"Amazon Cart","GDN-0027","March 22, 2016", "20 Gallon capacity",46.56,4.6,"http://www.gstatic.com/webp/gallery/1.jpg"));
        products.add(new Product(6,"SnapDeal Cart","GDN-0028","March 23, 2016", "21 Gallon capacity",47.56,4.7,"http://www.gstatic.com/webp/gallery/2.jpg"));
        products.add(new Product(5,"Amazon Cart","GDN-0027","March 22, 2016", "20 Gallon capacity",46.56,4.6,"http://www.gstatic.com/webp/gallery/1.jpg"));
        products.add(new Product(6,"SnapDeal Cart","GDN-0028","March 23, 2016", "21 Gallon capacity",47.56,4.7,"http://www.gstatic.com/webp/gallery/2.jpg"));
        products.add(new Product(5,"Amazon Cart","GDN-0027","March 22, 2016", "20 Gallon capacity",46.56,4.6,"http://www.gstatic.com/webp/gallery/1.jpg"));
        products.add(new Product(6,"SnapDeal Cart","GDN-0028","March 23, 2016", "21 Gallon capacity",47.56,4.7,"http://www.gstatic.com/webp/gallery/2.jpg"));
        products.add(new Product(5,"Amazon Cart","GDN-0027","March 22, 2016", "20 Gallon capacity",46.56,4.6,"http://www.gstatic.com/webp/gallery/1.jpg"));
        products.add(new Product(6,"SnapDeal Cart","GDN-0028","March 23, 2016", "21 Gallon capacity",47.56,4.7,"http://www.gstatic.com/webp/gallery/2.jpg"));
        products.add(new Product(5,"Amazon Cart","GDN-0027","March 22, 2016", "20 Gallon capacity",46.56,4.6,"http://www.gstatic.com/webp/gallery/1.jpg"));
        products.add(new Product(6,"SnapDeal Cart","GDN-0028","March 23, 2016", "21 Gallon capacity",47.56,4.7,"http://www.gstatic.com/webp/gallery/2.jpg"));
        products.add(new Product(5,"Amazon Cart","GDN-0027","March 22, 2016", "20 Gallon capacity",46.56,4.6,"http://www.gstatic.com/webp/gallery/1.jpg"));
        products.add(new Product(6,"SnapDeal Cart","GDN-0028","March 23, 2016", "21 Gallon capacity",47.56,4.7,"http://www.gstatic.com/webp/gallery/2.jpg"));
        products.add(new Product(5,"Amazon Cart","GDN-0027","March 22, 2016", "20 Gallon capacity",46.56,4.6,"http://www.gstatic.com/webp/gallery/1.jpg"));
        products.add(new Product(6,"SnapDeal Cart","GDN-0028","March 23, 2016", "21 Gallon capacity",47.56,4.7,"http://www.gstatic.com/webp/gallery/2.jpg"));
        products.add(new Product(5,"Amazon Cart","GDN-0027","March 22, 2016", "20 Gallon capacity",46.56,4.6,"http://www.gstatic.com/webp/gallery/1.jpg"));
        products.add(new Product(6,"SnapDeal Cart","GDN-0028","March 23, 2016", "21 Gallon capacity",47.56,4.7,"http://www.gstatic.com/webp/gallery/2.jpg"));
        products.add(new Product(5,"Amazon Cart","GDN-0027","March 22, 2016", "20 Gallon capacity",46.56,4.6,"http://www.gstatic.com/webp/gallery/1.jpg"));
        products.add(new Product(6,"SnapDeal Cart","GDN-0028","March 23, 2016", "21 Gallon capacity",47.56,4.7,"http://www.gstatic.com/webp/gallery/2.jpg"));
        products.add(new Product(5,"Amazon Cart","GDN-0027","March 22, 2016", "20 Gallon capacity",46.56,4.6,"http://www.gstatic.com/webp/gallery/1.jpg"));
        products.add(new Product(6,"SnapDeal Cart","GDN-0028","March 23, 2016", "21 Gallon capacity",47.56,4.7,"http://www.gstatic.com/webp/gallery/2.jpg"));
        products.add(new Product(5,"Amazon Cart","GDN-0027","March 22, 2016", "20 Gallon capacity",46.56,4.6,"http://www.gstatic.com/webp/gallery/1.jpg"));
        products.add(new Product(6,"SnapDeal Cart","GDN-0028","March 23, 2016", "21 Gallon capacity",47.56,4.7,"http://www.gstatic.com/webp/gallery/2.jpg"));

        return products;
    }
}
