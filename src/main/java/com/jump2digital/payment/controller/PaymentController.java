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
    //Devuelve todos los tickets
    @GetMapping("/tickets")
    public List<Ticket> getTickets(){
        return ticketService.getAllTickets();
    }
    //devuelve un ticket segun su UUID
    @GetMapping("/ticket")
    public Ticket getTicket(@RequestParam("id") UUID id){
        return ticketService.getTicket(id);
    }
    //sube un ticket
    @PostMapping("/ticket")
    public void postTicket(Ticket t){
        ticketService.postTicket(t);
    }
    //Borra un ticket segun du UUID
    @DeleteMapping("/ticket")
    public void modifyTicket(@RequestParam("id") UUID id){
        ticketService.deleteTicket(id);
    }
    //Añade un producto a un ticket, requiere de el UUID del ticket y la del producto
    @PostMapping("/ticket/product")
    public void addProductToTicket(@RequestParam("ticketId") UUID ticketId,@RequestParam("productId") UUID productId){
        ticketService.addProduct(ticketId,productId);
    }
    //Devuelve un dto con las analiticas de los pagos
    @GetMapping("/ticket/analytics")
    public AnaliticsDto getAnalytics(){
        return ticketService.getAnaliticsDto();
    }
    //Devuelve un producto segun su UUID
    @GetMapping("/product")
    public Product getProduct(@RequestParam("id") UUID id){
        return productService.getProduct(id);
    }
    //Sube un producto
    @PostMapping("/product")
    public void postProduct(Product p){
        productService.postProduct(p);
    }
    //Actualiza un producto
    @PutMapping("/product")
    public void modifyProduct(Product p){
        productService.modifyProduct(p);
    }
    //Borra un producto segun su UUID
    @DeleteMapping("/product")
    public void deleteProduct(@RequestParam("id") UUID id){
        productService.deleteProdut(id);
    }
    //Devuelve una lista de todos los productos
    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }
}
