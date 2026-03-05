package com.example.Atividade3;

public class Cliente {
    private String nome;
    private String idade;
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Cliente(String nome, String idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }
}
