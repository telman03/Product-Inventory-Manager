package com.example.productapi.Repository;

import com.example.productapi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    Optional<Product> findProductByProductId(Integer productId);
}
