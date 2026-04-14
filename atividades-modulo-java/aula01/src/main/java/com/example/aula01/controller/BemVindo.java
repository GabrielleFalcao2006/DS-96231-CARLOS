package com.example.aula01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


//EndPoint
@RestController
public class BemVindo {

    @GetMapping("/")
    public String mensagem() {
        return "Bem-vindo";
    }


    @GetMapping("/dev")
    public String devt() {
        return "Feito por: Gabi!! <3";
    }
}