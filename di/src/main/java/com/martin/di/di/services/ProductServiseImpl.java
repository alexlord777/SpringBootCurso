package com.martin.di.di.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.martin.di.di.models.Product;
import com.martin.di.di.repositores.ProductRepositore;


@Service
public class ProductServiseImpl implements ProductService {

  private ProductRepositore p;

  public ProductServiseImpl(@Qualifier("productFoo") ProductRepositore p) {
    this.p = p;
  }

  public List<Product> getAll(){
    return p.getAll().stream().map(w ->{
        Double price = w.getPrice()*1.5D;
        Product k= (Product) w.clone();
        k.setPrice(price.longValue());
        return k;
    }).collect(Collectors.toList());
  }

  public Product getById(Long id){
    return p.getById(id);
  }
}
