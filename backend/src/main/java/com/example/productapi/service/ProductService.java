package com.example.productapi.service;


import com.example.productapi.Repository.ProductRepository;
import com.example.productapi.exception.ProductNotFoundException;
import com.example.productapi.model.Product;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<Product> getAllProducts(){
        return  productRepository.findAll();
    }

    public Optional<Product> getProductById(Integer productId){
        return Optional.ofNullable(productRepository.findProductByProductId(productId).orElseThrow(
                () -> new ProductNotFoundException("Product not found with id: " + productId)
        ));
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    } 

}
