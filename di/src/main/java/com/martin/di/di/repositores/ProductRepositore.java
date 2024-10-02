package com.martin.di.di.repositores;

import java.util.List;

import com.martin.di.di.models.Product;

public interface ProductRepositore {
    List<Product> getAll();

    Product getById(Long id);
}
