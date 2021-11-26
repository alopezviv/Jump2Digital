package com.jump2digital.payment.service;

import com.jump2digital.payment.collection.Product;
import com.jump2digital.payment.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProductService {
    @Autowired
    ProductDao productDao;
    public Product getProduct(UUID id){
        return productDao.findById(id).get();
    }
    public void postProduct(Product p){
        productDao.save(p);
    }
    public void modifyProduct(Product p){
        productDao.save(p);
    }
    public void deleteProdut(UUID id){
        Product p = getProduct(id);
        productDao.delete(p);
    }
    public List<Product> getAllProducts(){
        return productDao.findAll();
    }
}
