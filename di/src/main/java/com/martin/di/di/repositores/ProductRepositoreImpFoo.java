package com.martin.di.di.repositores;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.martin.di.di.models.Product;

@Primary
@Repository("productFoo")
public class ProductRepositoreImpFoo implements ProductRepositore {

    List<Product> list;

    public ProductRepositoreImpFoo(){
       this.list=Arrays.asList(
        new Product(1L,"lima",23L));
        
    }


    @Override
    public List<Product> getAll() {
       return list;
    }

    @Override
    public Product getById(Long id) {
        return list.stream().filter(p-> p.getId()==id).findFirst().orElse(null);
    }
    
}
