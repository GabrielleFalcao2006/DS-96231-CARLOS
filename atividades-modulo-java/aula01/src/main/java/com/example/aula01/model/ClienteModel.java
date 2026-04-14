package com.example.aula01.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ClienteModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Duvida = CRTL + ESPAÇO
    private Long ID;

    private String nome;
    private String email;
    private String telefone;


    public ClienteModel() {}

    public ClienteModel(Long ID, String nome, String email, String telefone) {
        this.ID = ID;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
