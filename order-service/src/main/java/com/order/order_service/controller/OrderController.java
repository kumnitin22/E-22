package com.order.order_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @GetMapping("/order")
    public String getAllOrder(){
      return "ok successful";
    }

    @GetMapping("/order/{id}")
    public String getorderByid(){
        return  "Done";
    }

}
