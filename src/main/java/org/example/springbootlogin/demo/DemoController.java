package org.example.springbootlogin.demo;

import lombok.RequiredArgsConstructor;
import org.example.springbootlogin.jwt.JwtService;
import org.example.springbootlogin.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class DemoController {

    @PostMapping(value = "demo")
    public String wellcome(@AuthenticationPrincipal User user) {
        return "Wellcome "+ user.getUsername() + " from secure endpoint ";
    }
}
