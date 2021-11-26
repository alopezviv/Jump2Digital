package com.jump2digital.payment.service;

import com.jump2digital.payment.collection.PaymentType;
import com.jump2digital.payment.collection.Product;
import com.jump2digital.payment.collection.Ticket;
import com.jump2digital.payment.dao.TicketDao;
import com.jump2digital.payment.dto.AnaliticsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TicketService {
    @Autowired
    TicketDao ticketDao;
    @Autowired
    ProductService productService;
    public List<Ticket> getAllTickets(){
        return ticketDao.findAll();
    }
    public Ticket getTicket(UUID id){
        return ticketDao.findById(id).get();

    }
    public void postTicket(Ticket t){
        ticketDao.save(t);
    }
    public void deleteTicket(UUID id){
        Ticket t = ticketDao.findById(id).get();
        ticketDao.delete(t);
    }
    //add a product in a ticket, calculate the amount and update the ticket in the DB
    public void addProduct(UUID ticketId,UUID productId){
        Ticket t = getTicket(ticketId);
        Product p = productService.getProduct(productId);
        t.getProducts().add(p);
        calculateAmount(t);
        ticketDao.save(t);
    }
    //Sum the prices of the Products in a ticket
    public void calculateAmount(Ticket t){
        double amount = 0;
        List<Product> productList = t.getProducts();
        for(Product p: productList){
            amount += p.getPrice();
        }
        t.setAmount(amount);

    }
    public AnaliticsDto getAnaliticsDto(){
        double totalAmount=0.0;
        int laptops=0;
        int Pcs=0;
        int phones=0;
        int tablets=0;
        int others=0;
        int visaPayments=0;
        int mastercardPayments=0;
        List<Ticket> ticketList= getAllTickets();
        for (Ticket t: ticketList){
            totalAmount += t.getAmount();
            if(t.getPaymentType().equals(PaymentType.Visa)){
                visaPayments++;
            }else{
                mastercardPayments++;
            }
            List<Product> productList = t.getProducts();
            for (Product p: productList){
                switch (p.getDescription()){
                    case Pc:
                        Pcs++;
                        break;
                    case Other:
                        others++;
                        break;
                    case Phone:
                        phones++;
                        break;
                    case Laptop:
                        laptops++;
                        break;
                    case Tablet:
                        tablets++;
                        break;
                    default:
                        break;
                }
            }
        }

        return new AnaliticsDto(totalAmount,laptops,Pcs,phones,tablets,
                others,visaPayments,mastercardPayments);
    }

}
