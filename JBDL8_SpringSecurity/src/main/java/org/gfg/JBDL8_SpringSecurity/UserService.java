package org.gfg.JBDL8_SpringSecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    UserRepository userRepository;

    public User createNewUser(UserCreationRequest userCreationRequest){
        User user = User.builder().id(userCreationRequest.getId()).username(userCreationRequest.getUsername())
                .password(passwordEncoder.encode(userCreationRequest.getPassword()))
                .role(userCreationRequest.getRole()).build();

        User savedUser = userRepository.save(user);
        return savedUser;
    }
}
