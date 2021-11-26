package com.jump2digital.payment.config;

import com.jump2digital.payment.beans.ProductUUIDListener;
import com.jump2digital.payment.beans.TicketUUIDListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@Configuration
@EnableMongoAuditing
public class MongoConfiguration {

    @Bean
    public TicketUUIDListener generateTicketUUIDListener() {
        return new TicketUUIDListener();
    }
    @Bean
    public ProductUUIDListener generateProductUUIDListener(){return new ProductUUIDListener();}


}