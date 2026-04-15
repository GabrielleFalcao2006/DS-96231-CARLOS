package com.example.api_rev.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BemVindo {

    @GetMapping("/")
    public String mensagem(){
        return "Bem-Vindo!";
    }

    @GetMapping("/dev")
    public String nome(){
        return "Meu nome é Gabi <3";
    }
}
