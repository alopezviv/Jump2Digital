package com.jump2digital.payment.beans;

import com.jump2digital.payment.collection.Product;
import com.jump2digital.payment.collection.Ticket;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;

import java.util.UUID;

public class ProductUUIDListener extends AbstractMongoEventListener<Product> {
    public void onBeforeConvert(BeforeConvertEvent<Product> event) {
        Product p = event.getSource();
        if(p.isNew()) {
            p.setId(UUID.randomUUID());
        }
    }

}
