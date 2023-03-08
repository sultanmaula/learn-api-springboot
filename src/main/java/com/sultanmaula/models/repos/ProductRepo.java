package com.sultanmaula.models.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sultanmaula.models.entities.Product;

public interface ProductRepo extends CrudRepository<Product, Long>{

    List<Product> findByNameContains(String name);
}
