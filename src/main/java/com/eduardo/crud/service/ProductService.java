package com.eduardo.crud.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class ProductService {
    @GetMapping("/name/{productName}")
    public Product getProductByName(@PathVariable("productName") String productName) {

    }
}
