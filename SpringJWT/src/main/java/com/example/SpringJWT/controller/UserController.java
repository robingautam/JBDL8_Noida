package com.example.SpringJWT.controller;

import com.example.SpringJWT.request.User;
import com.example.SpringJWT.request.UserCreationRequest;
import com.example.SpringJWT.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/user-service")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/create/user")
    public User createUser(@RequestBody UserCreationRequest userCreationRequest){
        return userService.createNewUser(userCreationRequest);
    }

    @PostMapping("/user/sign")
    public String userSignIn(@RequestBody Map<String,String> request){
        String username = request.get("username");
        String password = request.get("password");

        return userService.validateUserAndCreateToken(username,password);

    }

    @GetMapping("/hello")
    public String hello(){
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return "Hi "+userDetails.getUsername();
    }
}
