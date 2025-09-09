package org.gfg.JBDL8_SpringSecurity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

   /* @Bean
    public UserDetailsService userDetailsService(){
        UserDetails user1 = User.builder().username("robin").password(passwordEncoder().encode("123456")).build();
        UserDetails user2 = User.builder().username("aakash").password(passwordEncoder().encode("123456")).build();
        UserDetails user3 = User.builder().username("preeti").password(passwordEncoder().encode("123456")).build();

        return new InMemoryUserDetailsManager(user1,user2,user3);
    }*/

    @Bean
    public UserDetailsService userDetailsService(){
        return new CustomUserDetailsService();
    }

    /*@Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.csrf(csrf->csrf.disable())
                .authorizeHttpRequests(request->request.anyRequest().permitAll());
        return httpSecurity.build();
    }*/


    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
            httpSecurity.csrf(csrf->csrf.disable());
            httpSecurity.authorizeHttpRequests(request->request.requestMatchers("/users/create/user").permitAll());
            httpSecurity.authorizeHttpRequests(request->request.requestMatchers("/get/public").permitAll());
            httpSecurity.authorizeHttpRequests(request->request.requestMatchers("/get/protected").authenticated());
            httpSecurity.authorizeHttpRequests(request->request.requestMatchers("/get/private").hasRole("ADMIN"));
           httpSecurity.formLogin(Customizer.withDefaults());
    //    httpSecurity.httpBasic(Customizer.withDefaults());
            return httpSecurity.build();


    }
}
