package org.example;

import java.util.Scanner;

public class Atividade {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String Usuario = "Gabrielle";
        int Senha = 2006;
        String TentUsuario;
        int TentSenha;

        do {
            System.out.println("Digite o nome do usuário: ");
            TentUsuario = ler.nextLine();

            System.out.println("Digite a senha: ");
            TentSenha = ler.nextInt();

            if (Usuario.equals(TentUsuario) && Senha == TentSenha) {
                System.out.println("Bem-Vindo, usuário logado!");
            } else {
                System.out.println("Nome do usuário ou senha inválidos.");
            }

        } while (!TentUsuario.equals(Usuario) || TentSenha != Senha);

        ler.close();
    }
}
