package org.gfg.JBDL8_OrderService.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    int orderId;
    String productId;
    String productName;
    String productDescription;
    double price;
}