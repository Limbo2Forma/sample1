package com.example.demo.model;

import javax.persistence.*;

// import org.springframework.data.relational.core.mapping.Column;

import lombok.Data;

@Entity
@Data
@Table(name="brand")
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long brandId;

    private String brandName;
    private String slug;
}
