package com.wiley.springBootNew.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellocontroller {

    @GetMapping
    public String hellowworkld() {
        return "Welcome to spring boot first api";
    }
}
