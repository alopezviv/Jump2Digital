package com.jump2digital.payment.dao;

import com.jump2digital.payment.collection.Ticket;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;
import java.util.UUID;

public interface TicketDao extends MongoRepository<Ticket,Integer> {
    Optional<Ticket> findById(UUID id);

}
