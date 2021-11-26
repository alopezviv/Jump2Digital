package com.jump2digital.payment.controller;

import com.jump2digital.payment.collection.Product;
import com.jump2digital.payment.collection.Ticket;
import com.jump2digital.payment.dto.AnaliticsDto;
import com.jump2digital.payment.service.ProductService;
import com.jump2digital.payment.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1")
public class PaymentController {
    @Autowired
    TicketService ticketService;
    @Autowired
    ProductService productService;
    @GetMapping("/tickets")
    public List<Ticket> getTickets(){
        return ticketService.getAllTickets();
    }
    @GetMapping("/ticket")
    public Ticket getTicket(@RequestParam("id") UUID id){
        return ticketService.getTicket(id);
    }
    @PostMapping("/ticket")
    public void postTicket(Ticket t){
        ticketService.postTicket(t);
    }
    @DeleteMapping("/ticket")
    public void modifyTicket(@RequestParam("id") UUID id){
        ticketService.deleteTicket(id);
    }
    @PostMapping("/ticket/product")
    public void addProductToTicket(@RequestParam("ticketId") UUID ticketId,@RequestParam("productId") UUID productId){
        ticketService.addProduct(ticketId,productId);
    }
    @GetMapping("/ticket/analytics")
    public AnaliticsDto getAnalytics(){
        return ticketService.getAnaliticsDto();
    }
    @GetMapping("/product")
    public Product getProduct(@RequestParam("id") UUID id){
        return productService.getProduct(id);
    }
    @PostMapping("/product")
    public void postProduct(Product p){
        productService.postProduct(p);
    }
    @PutMapping("/product")
    public void modifyProduct(Product p){
        productService.modifyProduct(p);
    }
    @DeleteMapping("/product")
    public void deleteProduct(@RequestParam("id") UUID id){
        productService.deleteProdut(id);
    }
    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }
}
