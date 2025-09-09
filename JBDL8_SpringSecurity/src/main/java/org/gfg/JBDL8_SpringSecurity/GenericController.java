package org.gfg.JBDL8_SpringSecurity;

import org.springframework.security.web.server.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GenericController {

    @GetMapping("/get/hello")
    public String getHello(){
        System.out.println("Inside the get hello controller");
        return "Hello World!!";
    }


    @GetMapping("/get/public")
    public String publicAPI(){
        return "Inside the Public URL, Anyone can access";
    }

    @GetMapping("/get/protected")
    public String protectedAPI(){
        return "This is Protected API, can be access after login";
    }

    @GetMapping("/get/private")
    public String privateAPI(){
        return "Only ADMIN can access";
    }


}
