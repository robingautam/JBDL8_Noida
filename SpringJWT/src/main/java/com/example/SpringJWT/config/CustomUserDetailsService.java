package com.example.SpringJWT.config;

import com.example.SpringJWT.repository.UserRepository;
import com.example.SpringJWT.request.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component("customUserDetailsService")
public class CustomUserDetailsService implements UserDetailsService  {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("Isnide loadusername: "+username);

        User dbUser = userRepository.findByEmail(username);

        return org.springframework.security.core.userdetails.User.builder().username(username).password(dbUser.getPassword()).build();

    }
}
