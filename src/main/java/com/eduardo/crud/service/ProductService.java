package com.eduardo.crud.service;

import com.eduardo.crud.model.Product;
import com.eduardo.crud.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public Product findByName(String productName) {
        return productRepository.findByName(productName);
    }

    public Product save(Product product) {
        product.setId(null);

        return productRepository.save(product);
    }

    public void deleteById(String id) {
        productRepository.deleteById(id);
    }
}
