package com.martin.di.di.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.martin.di.di.models.Product;
import com.martin.di.di.services.ProductService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api")
public class ProductControllers {

    @Autowired
    ProductService ps;
   
    @GetMapping
    public List<Product> getAll() {
        return ps.getAll();
    }
    
    @GetMapping("/{id}")
    public Product getMethodName(@PathVariable Long id) {
        return ps.getById(id);
    }
    

}
