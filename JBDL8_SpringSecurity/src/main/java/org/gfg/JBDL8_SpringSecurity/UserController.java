package org.gfg.JBDL8_SpringSecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/create/user")
    public User createUser(@RequestBody UserCreationRequest userCreationRequest){
       return userService.createNewUser(userCreationRequest);

    }
}
