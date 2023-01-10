package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Review;
import com.example.demo.repository.ReviewRepository;

@Service
public class ReviewService {
    @Autowired
    private ReviewRepository reviewRepository;

    public Review getReview(Long id) {
        Optional<Review> r = reviewRepository.findById(id);
        if (r.isPresent()) return r.get();
        else return null;
    }

    public void createReview(Review Review) {
        reviewRepository.save(Review);
    }
}
