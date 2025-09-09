package org.gfg.JBDL8_UserService;

import org.gfg.JBDL8_UserService.model.Order;
import org.gfg.JBDL8_UserService.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class UserService {

    @Autowired
    RestTemplate restTemplate;

    WebClient webClient = WebClient.create();

    @Autowired
    OrderServiceClient orderServiceClient;



    static List<User> list = new ArrayList<>();

    static {
        User u1 = new User(1,"Robin", "robin@gmail.com");
        User u2 = new User(2,"Preeti", "preeti@gmail.com");
        User u3 = new User(3,"Lokesh", "lokesh@gmail.com");
        User u4 = new User(4,"Sagar", "sagar@gmail.com");

        list = Arrays.asList(u1,u2,u3,u4);
    }

    public User getUserById(int id){
        User user=null;
        for (User u: list){
            if (u.getId()==id){
                user = u;
                break;
            }
        }

     //  List<Order> orderList = restTemplate.getForObject("http://ORDERSERVICE/orders/get/order/"+id, List.class);
    //    user.setOrderList(orderList);
    //    List<Order> orderList = webClient.get().uri("http://localhost:8092/orders/get/order/" + id).retrieve().bodyToMono(List.class).block();
    //    user.setOrderList(orderList);
       List<Order> orderList = orderServiceClient.callOrderService(id+"");
        user.setOrderList(orderList);
        return user;
    }
}
