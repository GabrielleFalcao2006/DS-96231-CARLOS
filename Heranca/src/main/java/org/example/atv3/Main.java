package org.example.atv3;

public class Main {
    public static void main(String[] args) {
        Endereco e1 = new Endereco("Rua A","88","não tem","420556890","Salvador");
        Endereco e2 = new Endereco("Rua B", "55","não tem","5515565","Salvador");

        Medico m1 = new Medico("Gabrielle","gabrielle@gmail.com", 12.500F,e1,"007");
        Engenheiro eng1 = new Engenheiro("Álvaro","Alvaro@gmail.com", 10.250F,e2,"225");

        System.out.println(m1.toString());
        System.out.println(eng1.toString());

    }
}
