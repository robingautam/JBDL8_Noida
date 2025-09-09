package org.gfg.JBDL8_OrderService.model;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class OrderService {

    static List<Order> allOrders = new ArrayList<>();

    static {
        Order o1 = new Order(1,"1001","IPhone 15", "Best IPhone", 60000);
        Order o2 = new Order(2,"1002","Macbook Pro", "Best Laptop", 160000);
        Order o3 = new Order(3,"1003","Samsung Ultra", "Best Phone", 110000);
        Order o4 = new Order(4,"1004","IPad", "Best Tablet", 70000);
        Order o5 = new Order(5,"1005","Rich dad Poor dad", "Best selling book", 300);
        allOrders = Arrays.asList(o1,o2,o3,o4,o5);
    }

    public List<Order> getOrderList(int userId){
        List<Order> orders = new ArrayList<>();
        if (userId==1){
            orders.add(allOrders.get(1));
            orders.add(allOrders.get(2));
        }else if (userId==2){
            orders.add(allOrders.get(0));
            orders.add(allOrders.get(3));
        }else {
            orders.add(allOrders.get(4));
        }
        return orders;
    }
}
