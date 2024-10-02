package com.martin.di.di.services;

import java.util.List;

import com.martin.di.di.models.Product;

public interface ProductService {
      List<Product> getAll();
      
      Product getById(Long id);
}
