package com.example.demo.model;

import javax.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="review")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long reviewId;

    private String userName;
    private String shortDesc;
    private Integer rating;

    @ManyToOne
    @JoinColumn(name="product")
    private Product product;
}
