package com.jump2digital.payment.collection;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mongodb.lang.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document(collection = "products")
public class Product {
    @Id
    private UUID id;
    private String name;
    private double price;
    @NonNull
    private ProductType description;
    public Product(){}

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ProductType getDescription() {
        return description;
    }

    public void setDescription(ProductType description) {
        this.description = description;
    }
    @JsonIgnore
    public boolean isNew() {
        return getId() == null;
    }
}
