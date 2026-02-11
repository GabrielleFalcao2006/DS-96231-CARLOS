package org.example;

public class ComparacaoTipos {
    public static void main(String[] args) {
        String NomeUsuario = "Marta";
        int senha = 123;

        boolean ResultadoNome = NomeUsuario.equals("Marta");
        boolean ResultadoSenha = (senha == 456);

        System.out.println("O nome do usuário está correto? " + ResultadoNome);
        System.out.println("A senha do usuário está correta? " + ResultadoSenha);
    }
}
