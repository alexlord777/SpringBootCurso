package com.martin.di.di.repositores;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.martin.di.di.models.Product;

@Repository
public class RepositoreProductImpl implements ProductRepositore {
    List<Product> list;

    public RepositoreProductImpl(){
       this.list=Arrays.asList(
        new Product(1L,"potatoe",23L),
        new Product(2L,"melon",13L),
        new Product(3L,"tomatoe",33L),
        new Product(4L,"banana",24L));
    }

    public List<Product> getAll(){
        return list;
    }

    public Product getById(Long id){
        return list.stream().filter(p-> p.getId()==id).findFirst().orElse(null);
    }
}
