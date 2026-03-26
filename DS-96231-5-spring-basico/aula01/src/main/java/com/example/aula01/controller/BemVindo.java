package com.example.aula01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BemVindo {

    @GetMapping ("/")
    public String mensagem(){
        return "Bem-vindo";
    }

    @GetMapping ("/dev")
    public String nomeDev() {
        return "Feito por: Gabi";

    }

    @GetMapping ("/dev/teste")
    public String teste(){
        return "Teste!!!!!!!!!";
    }
}
