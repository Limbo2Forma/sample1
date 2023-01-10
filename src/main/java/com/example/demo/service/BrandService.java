package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Brand;
import com.example.demo.repository.BrandRepository;

@Service
public class BrandService {
    @Autowired
    private BrandRepository brandRepository;

    public Brand getBrand(Long id) {
        Optional<Brand> b = brandRepository.findById(id);
        if (b.isPresent()) return b.get();
        else return null;
    }

    public void createBrand(Brand brand) {
        brandRepository.save(brand);
    }
}
