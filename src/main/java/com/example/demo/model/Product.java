package com.example.demo.model;

import java.util.Set;

import javax.persistence.*;

// import org.springframework.data.relational.core.mapping.Column;

import lombok.Data;

@Entity
@Data
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String productName;
    private String shortDesc;
    private Integer price;
    private Integer stock;
    private Integer sold;

    private Brand brand;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "review", cascade = { CascadeType.REMOVE })
    private Set<Review> reviews;
}
