package org.example.laco;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println ("Digite sua idade: ");
        int idade = ler.nextInt ();

        while(idade<18){
            System.out.println ("Acesso negado!");
            System.out.println ("Digite sua idade: ");
            idade = ler.nextInt ();
        }
        System.out.println ("Acesso permitido!!!0");
        System.out.println ("Carregando...");

    }
}
