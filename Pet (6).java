package com.example.Atividade2;

public class Cliente {
    private String nome;
    private int idade;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Cliente(String nome, int idade, Pet pet1) {
        this.nome = nome;
        this.idade = idade;
    }
}
