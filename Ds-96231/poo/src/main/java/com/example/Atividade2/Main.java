package com.example.Atividade2;

public class Main {
    public static void main(String[] args) {
        Pet pet1 = new Pet("Lulu", 1,"Golden");
        Cliente cliente1 = new Cliente("Rodrigo", 21,pet1);

        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Pet: " + pet1.getNome() );
    }
}
