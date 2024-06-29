package com.example.manager.service;

import com.example.manager.entity.Product;
import java.util.List;

public interface ProductService {
    List<Product> findAllProducts();

    Product createProduct(String title, String details);
}
