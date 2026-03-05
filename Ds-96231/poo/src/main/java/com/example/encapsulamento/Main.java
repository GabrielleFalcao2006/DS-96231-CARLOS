package com.example.encapsulamento;

public class Main {

    public static void main(String[] args) {
        // String nome;
        // int idade;

        // nome = "Marta";
        // idade = 22;

        // PROGRAMAÇÃO ORIENTADA A OBJETOS
        cliente cliente1 = new cliente();
        cliente1.setNome("Marta");
        cliente1.setIdade(22);

        Pet pet1 = new Pet();
        pet1.setNome("Bob");
        pet1.setIdade(2);

        livro livro1 = new livro();
        livro1.setNome("Interestelar");
        livro1.setPreco(89.90);

        Funcionario funcionario1 = new Funcionario();
        funcionario1.setCargo("Supervisor");
        funcionario1.setNome("João");
        funcionario1.setSalario(2.500);


        System.out.println("Nome:" + cliente1.getNome());
        System.out.println("Idade" + cliente1.getIdade());

        System.out.println(pet1.getNome());
        System.out.println(pet1.getIdade());

        System.out.println("Livro:" + livro1.getNome());
        System.out.println("Preço:" + livro1.getPreco());

        System.out.println("Cargo:" + funcionario1.getCargo() );
        System.out.println("Salário:" + funcionario1.getSalario());
        System.out.println("Nome:" + funcionario1.getNome());
    }

}
