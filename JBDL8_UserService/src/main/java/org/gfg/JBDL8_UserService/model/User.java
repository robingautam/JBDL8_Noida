package org.gfg.JBDL8_UserService.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    public User(int id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }

    int id;
    String name;
    String email;
    List<Order> orderList;
}
