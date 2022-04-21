package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mensaje2Controller {
    @GetMapping("/estado")
    public String estado(){
        return ("prueba de branch");
    }
}