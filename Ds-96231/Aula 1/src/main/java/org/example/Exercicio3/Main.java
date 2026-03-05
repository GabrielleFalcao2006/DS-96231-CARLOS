package org.example.Exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira seu nome:");
        String nome = sc.nextLine();

        System.out.println("Insira a nota da sua primeira prova");
        float nota1 = sc.nextFloat();

        System.out.println("Insira a nota da sua segunda prova");
        float nota2 = sc.nextFloat();

        sc.close();


        if (nota1+nota2<7) System.out.println("Aluno Reprovado");
        else if (nota1+nota2>=7) System.out.println("Aluno aprovado");
        if (nota1 + nota2 == 6.9F) System.out.println("Média suplementar");

    }
}
