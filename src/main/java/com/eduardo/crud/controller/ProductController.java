package com.eduardo.crud.controller;

import com.eduardo.crud.model.Product;
import com.eduardo.crud.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductController {
    private final ProductService productService;

    @GetMapping("/find-by-name/{productName}")
    public Product getProductByName(@PathVariable String productName) {
        return productService.findByName(productName);
    }

    @PostMapping("/save")
    public Product createProduct(@RequestBody Product product) {
        return productService.save(product);
    }
}
