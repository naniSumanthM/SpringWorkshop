package com.luv2code.springboot.demo.SpringApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;

@RestController
public class SpringRestController {

    @GetMapping("/")
    public String sayHello(){
        return "Hello Spring: " + LocalDateTime.now();
    }





}
