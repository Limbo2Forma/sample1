package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Brand;
import com.example.demo.service.BrandService;

@RestController(value = "/brand")
public class BrandController {
    @Autowired
    private BrandService brandService;

    @PostMapping(value = "/create")
    public void createProduct(@RequestBody Brand brand) {
        brandService.createBrand(brand);
    }
}
