package com.example.SpringJWT.service;

import com.example.SpringJWT.repository.UserRepository;
import com.example.SpringJWT.request.User;
import com.example.SpringJWT.request.UserCreationRequest;
import com.example.SpringJWT.util.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    UserRepository userRepository;

    @Autowired
    private JWTUtil jwtUtil;

    public User createNewUser(UserCreationRequest userCreationRequest){
        User user = User.builder().name(userCreationRequest.getName()).email(userCreationRequest.getEmail())
                .role(userCreationRequest.getRole()).build();

        user.setPassword(passwordEncoder.encode(userCreationRequest.getPassword()));

        return userRepository.save(user);
    }

    public String validateUserAndCreateToken(String username, String password){
        User user = userRepository.findByEmail(username);
        if (passwordEncoder.matches(password,user.getPassword())){
            return jwtUtil.generateToken(username);
        }else {
            return "NOT OK";
        }
    }
}
