package com.example.Atividade3;

public class Main {
    public static void main(String[] args) {
        Conta_banco contaBanco1 = new Conta_banco("Santander", "123","234","3.000","10.000","8989");;
        Cliente cliente1 = new Cliente("Rodrigo", "21", "Rd@");

        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Banco: " + contaBanco1.getBanco());
    }
}
