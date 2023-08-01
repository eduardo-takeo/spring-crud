package com.eduardo.crud.repository;

import com.eduardo.crud.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository {
    public Product findByName(String productName);
}
