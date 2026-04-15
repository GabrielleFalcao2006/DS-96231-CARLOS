package com.example.api_rev.model;

public enum ColaboradorSetor {

    FINANCEIRO("financeiro"),
    RECURSOS_HUMANOS("recursos humanos"),
    VENDAS("vendas"),
    MARKETING("marketing");

    private String texto;

    ColaboradorSetor(String texto){
        this.texto = texto;
    }
}
