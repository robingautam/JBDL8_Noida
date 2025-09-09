package org.gfg.JBDL8_SpringSecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public  class CustomUserDetailsService implements UserDetailsService {


    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println(username);
       org.gfg.JBDL8_SpringSecurity.User user = userRepository.findByUsername(username);
        System.out.println("user: "+user);
       if (user==null){
           throw new UsernameNotFoundException("User not found in database");
       }
        UserDetails userDetails = User.builder().username(user.getUsername()).password(user.getPassword())
                .roles(user.getRole()).build();

       return userDetails;
    }
}
