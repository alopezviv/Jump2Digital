package com.jump2digital.payment.collection;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mongodb.lang.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Document(collection = "tickets")
public class Ticket {
    @Id
    private UUID id;
    private List<Product> products = new ArrayList<>();
    private double amount = 0;
    @NonNull
    private PaymentType paymentType;

    public Ticket(){}

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    @JsonIgnore
    public boolean isNew() {
        return getId() == null;
    }
}
