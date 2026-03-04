package com.example.Atividade1;

public class Main {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco( "Rua A","65", "Salvador");
        Cliente cliente1 = new Cliente("Rodrigo",21,endereco1 );

        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Cidade: " + cliente1.getEndereco().getCidade());
    }

}
