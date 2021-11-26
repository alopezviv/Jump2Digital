package com.jump2digital.payment.dao;

import com.jump2digital.payment.collection.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;
import java.util.UUID;

public interface ProductDao extends MongoRepository<Product,Integer> {
    Optional<Product>findById(UUID id);
}
