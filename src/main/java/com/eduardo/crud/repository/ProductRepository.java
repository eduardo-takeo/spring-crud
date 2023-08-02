package com.eduardo.crud.repository;

import com.eduardo.crud.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
    public Product findByName(String productName);

    public Product save(Product product);

    public void deleteById(String id);
}
