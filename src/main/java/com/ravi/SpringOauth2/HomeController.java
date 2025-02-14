package com.ravi.SpringOauth2;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/hello")
    public String greet(@AuthenticationPrincipal OAuth2User user) {
        return user.getAttributes().get("name") + " Hello " + user.getAttributes().get("email");
    }

//    @GetMapping("/user/h")
//    public Map<String, Object> userDetails(@AuthenticationPrincipal OAuth2User user) {
//        return user.getAttributes();
//    }
}
