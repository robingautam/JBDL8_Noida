package org.gfg.JBDL8_OAUTH;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {


    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
       /* httpSecurity.csrf(csrf->csrf.disable());
        httpSecurity.oauth2Client(Customizer.withDefaults());
        httpSecurity.oauth2Login(login->login.loginPage("/customlogin.html").permitAll().defaultSuccessUrl("/get/user/info"));
        //httpSecurity.oauth2Login(login->login.defaultSuccessUrl("/get/user/info"));
       // httpSecurity.authorizeHttpRequests(request->request.requestMatchers("/oauth/get/user/info").permitAll());
        httpSecurity.authorizeHttpRequests(request->request.anyRequest().authenticated());

        return httpSecurity.build();*/

        return httpSecurity.oauth2Login(oauth -> {
                    oauth.loginPage("/customlogin.html");
                    oauth.defaultSuccessUrl("/get/data");

                }).authorizeHttpRequests(auth->{
                    auth.requestMatchers("/customlogin.html/**").permitAll();
                    auth.anyRequest().authenticated();
                })
                .oauth2Login(Customizer.withDefaults()).build();



    }
}
