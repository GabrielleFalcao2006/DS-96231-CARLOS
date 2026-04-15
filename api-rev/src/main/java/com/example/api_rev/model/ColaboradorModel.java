package com.example.api_rev.model;

import jakarta.persistence.*;

@Entity
public class ColaboradorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String idade;
    private Double salario;

    @Enumerated(EnumType.STRING)
    private Sexo sexo;
    private ColaboradorSetor setor;

    public ColaboradorModel() {}

    public ColaboradorModel(Long id, String nome, String email, String idade, Double salario, Sexo sexo, ColaboradorSetor setor) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.salario = salario;
        this.sexo = sexo;
        this.setor = setor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public ColaboradorSetor getSetor() {
        return setor;
    }

    public void setSetor(ColaboradorSetor setor) {
        this.setor = setor;
    }
}
