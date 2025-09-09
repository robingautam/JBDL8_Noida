package org.gfg.JBDL8_OAUTH;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/hello")
    public String hello(){
        return "hello, this is oauth application";
    }


    @RequestMapping("/get/data")
    @GetMapping
    public String getData(@AuthenticationPrincipal OAuth2User oAuth2User){
        String name = oAuth2User.getAttribute("name");
        for (String key: oAuth2User.getAttributes().keySet()){
            System.out.println(key+": "+oAuth2User.getAttributes().get(key));
        }
        return "Inside get Data Method, Your name is "+name;
    }
}
