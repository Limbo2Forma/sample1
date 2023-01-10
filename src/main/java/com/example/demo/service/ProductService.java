package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product getProduct(Long id) {
        Optional<Product> p = productRepository.findById(id);

        if (p.isPresent()) return p.get();
        else return null;
    }

    public void createProduct(Product Product) {
        productRepository.save(Product);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
