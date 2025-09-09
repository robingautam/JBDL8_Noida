package org.gfg.JBDL8_UserService;

import org.gfg.JBDL8_UserService.model.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "ORDERSERVICE")
public interface OrderServiceClient {

    @GetMapping("/orders/get/order/{userId}")
    List<Order> callOrderService(@PathVariable("userId") String id);
}
