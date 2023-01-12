package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Brand;
import com.example.demo.service.BrandService;

@RestController
@RequestMapping(value = "/brands")
public class BrandController {
    @Autowired
    private BrandService brandService;

    @PostMapping(value = "/")
    public void createProduct(@RequestBody Brand brand) {
        brandService.createBrand(brand);
    }
}
