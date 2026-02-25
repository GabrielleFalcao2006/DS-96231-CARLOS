package com.example.encapsulamento;

public class Cliente {
    // ATRIBUTOS DA CLASSE
    private String nome;
    private int idade;

    // CONSTRUTOR
        
    // MÉTODOS DE ACESSO
    public String getNome() {
        return nome;
    }
    public Cliente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
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

}
