package com.example.OBSpringS456;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

//EJERCICIO 1
    @GetMapping("/")
    public String getHello(){
        return "Hello HomeWork";
    }

}
