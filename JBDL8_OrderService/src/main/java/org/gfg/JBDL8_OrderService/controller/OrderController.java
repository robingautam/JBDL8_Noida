package org.gfg.JBDL8_OrderService.controller;

import org.gfg.JBDL8_OrderService.model.Order;
import org.gfg.JBDL8_OrderService.model.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    OrderService orderService;

    static int count=0;

    @GetMapping("/get/order/{userId}")
    public List<Order> getOrderListByUserId(@PathVariable("userId") String id){
        System.out.println("Request Received: "+count++);
        int userId = Integer.parseInt(id);
        return  orderService.getOrderList(userId);
    }
}
