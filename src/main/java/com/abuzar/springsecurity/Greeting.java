package com.abuzar.springsecurity;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greeting {

    @GetMapping("/home")
    public String greet() {
        return "Hello World";
    }

    @PreAuthorize("hasRole('USER')")
    @GetMapping("/user")
    public String user() {
        return "Hello user";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/admin")
    public String admin() {
        return "Hello admin";
    }
}
