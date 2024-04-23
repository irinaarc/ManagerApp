package com.example.manager.repository;

import com.example.manager.entity.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> findAll();
}
