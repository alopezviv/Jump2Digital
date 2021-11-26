package com.jump2digital.payment.beans;

import com.jump2digital.payment.collection.Ticket;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;

import java.util.UUID;

public class TicketUUIDListener extends AbstractMongoEventListener<Ticket> {
    public void onBeforeConvert(BeforeConvertEvent<Ticket> event) {
        Ticket t = event.getSource();
        if(t.isNew()) {
            t.setId(UUID.randomUUID());
        }
    }
}
