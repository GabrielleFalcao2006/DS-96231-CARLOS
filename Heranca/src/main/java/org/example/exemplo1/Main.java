package org.example.exemplo1;

public class Main {

    public static void main(String[] args) {
        Cliente c1 = new Cliente("Gabrielle",19,"10/03/2026","Cartão" );
        Funcionario f1 = new Funcionario("Álvaro",27,"11522","Desenvolvedor",6.512);

        System.out.println(c1.toString());
        System.out.println(f1.toString());


    }
}
