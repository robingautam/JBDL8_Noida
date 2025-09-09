package org.gfg.JBDL8_UserService;

import org.gfg.JBDL8_UserService.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/get/users/{userId}")
    public User fetchUserById(@PathVariable ("userId") String id){
        int userId = Integer.parseInt(id);
        User user = userService.getUserById(userId);
        return user;
    }
}
