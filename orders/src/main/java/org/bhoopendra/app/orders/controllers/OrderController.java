package org.bhoopendra.app.orders.controllers;

import org.bhoopendra.app.orders.bean.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class OrderController {
    @GetMapping("/orders")
    public ResponseEntity<Order> getOrders(){
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1,"order1"));
        orders.add(new Order(2,"order2"));
        orders.add(new Order(3,"order3"));
        orders.add(new Order(4,"order4"));
        orders.add(new Order(5,"order5"));
        return new ResponseEntity(orders, HttpStatus.OK);
    }

    @GetMapping("/")
    public String getWelcomePage(){
        return "Welcome to orders application!";
    }
}
