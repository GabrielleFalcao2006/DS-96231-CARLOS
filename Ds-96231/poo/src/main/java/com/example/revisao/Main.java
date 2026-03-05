package com.example.revisao;

public class Main {
    public static void main(String[] args) {

        Professor professor1 = new Professor("Marta", "Lógica programação");

        Professor professor2 = new Professor("João","Banco de dados");


        System.out.println("Nome" + professor1.getNome());
        System.out.println("Disciplina:" + professor1.getDiscplina());
        System.out.println();
        System.out.println("Nome" + professor2.getNome());
        System.out.println("Disciplina" + professor2.getDiscplina());
    }
}
